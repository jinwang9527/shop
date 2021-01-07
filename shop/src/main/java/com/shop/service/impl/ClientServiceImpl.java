package com.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mysql.cj.xdevapi.Client;
import com.shop.common.*;
import com.shop.common.result.Result;
import com.shop.common.result.util.ResultModel;
import com.shop.entity.ClientDo;
import com.shop.entity.ClientRoleRelationDo;
import com.shop.entity.RoleDo;
import com.shop.mapper.ClientDoMapper;
import com.shop.mapper.ClientRoleRelationDoMapper;
import com.shop.mapper.RoleDoMapper;
import com.shop.service.ClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.shopEnum.NoEnum;
import com.shop.shopEnum.RoleEnum;
import com.shop.shopEnum.ShortMessageIdEnum;
import com.shop.vo.client.LoginVo;
import com.shop.vo.client.ObtainShortMessageVerificationVo;
import com.shop.vo.client.RegisterVo;
import com.shop.vo.client.UpdateClientVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-16
 */
@Slf4j
@Service
public class ClientServiceImpl extends ServiceImpl<ClientDoMapper, ClientDo> implements ClientService {

    @Autowired
    private UserInfoUtil userInfoUtil;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private SendMessageUtil sendMessageUtil;

    @Autowired
    private ClientRoleRelationDoMapper clientRoleRelationDoMapper;


    @Override
    public ResultModel login(LoginVo loginVo) throws Exception {
        if (loginVo.getAccount() == null) return Result.errorResultModel("登录失败！账号不能为空");
        if (loginVo.getPassword() == null) return Result.errorResultModel("登录失败！密码不能为空！");
        QueryWrapper<ClientDo> wrapper = new QueryWrapper<>();
        wrapper.eq("account", loginVo.getAccount())
                .eq("is_del", "n");
        List<ClientDo> clientDos = baseMapper.selectList(wrapper);
        if (clientDos.size() <= 0) return Result.errorResultModel("登录失败！请检查账号是否正确！");
        if (!clientDos.get(0).getPassword().equals(loginVo.getPassword()))
            return Result.errorResultModel("登录失败！密码不正确！");
        String token = TokenUtil.sign(clientDos.get(0).getPkClientId());
        return Result.successResultModel((Object) token);
    }


    @Override
    public ResultModel register(RegisterVo registerVo) throws Exception {
        /* 1、验证注册参数  */
        this.validRegisterParam(registerVo);
        /* 2、验证手机号是否已经注册和验证码  */
        this.validClientIsRepeatAndVerificationCode(registerVo);
        /* 3、添加客户  */
        ClientDo clientDo = this.addClientDo(registerVo);
        /* 4、添加客户角色  */
        this.clientRoleRelationDo(clientDo);

        return Result.successResultModel();
    }

    /**
     * 添加客户角色
     * @param clientDo
     * @throws Exception
     */
    private void clientRoleRelationDo(ClientDo clientDo) throws Exception {
        ClientRoleRelationDo clientRoleRelationDo = new ClientRoleRelationDo();
        clientRoleRelationDo.setIsDel("n");
        clientRoleRelationDo.setFkClientId(clientDo.getPkClientId());
        clientRoleRelationDo.setCreateId(clientDo.getPkClientId());
        clientRoleRelationDo.setFkRoleId(RoleEnum.BUYER.id);
        if (clientRoleRelationDoMapper.insert(clientRoleRelationDo) <= 0) throw new Exception("添加角色失败！");
    }

    /**
     * 添加客户
     *
     * @param registerVo
     * @return
     * @throws Exception
     */
    private ClientDo addClientDo(RegisterVo registerVo) throws Exception {
        ClientDo clientDo = new ClientDo();
        clientDo.setPassword(registerVo.getPassword());
        clientDo.setClientNo(NoUtil.generator(NoEnum.CLIENT));
        clientDo.setAccount(registerVo.getPhone());
        clientDo.setPhone(registerVo.getPhone());
        clientDo.setIsDel("n");
        if (baseMapper.insert(clientDo) <= 0) throw new Exception("注册用户失败！");
        return clientDo;
    }

    /**
     * 验证手机号是否已经注册和验证码
     *
     * @param registerVo
     * @throws Exception
     */
    private void validClientIsRepeatAndVerificationCode(RegisterVo registerVo) throws Exception {
        String phone = (String) redisUtil.get(registerVo.getVerificationCode());
        if (phone == null) throw new Exception("验证码已超时！");
        if (!phone.equals(registerVo.getPhone())) throw new Exception("验证码错误！");
        ClientDo item = new ClientDo();
        item.setPhone(registerVo.getPhone());
        QueryWrapper<ClientDo> wrapper = new QueryWrapper<>();
        wrapper.eq("phone", registerVo.getPhone()).eq("is_del", "n");
        List<ClientDo> objects = baseMapper.selectList(wrapper);
        if (objects.size() > 0) throw new Exception("该手机号码已被注册！");
    }


    /**
     * 验证注册参数
     *
     * @param registerVo
     * @throws Exception
     */
    private void validRegisterParam(RegisterVo registerVo) throws Exception {
        Assert.isNull(registerVo.getClientName(), "用户名称不能为空！");
        Assert.isNull(registerVo.getPassword(), "用户密码不能为空！");
        Assert.isNull(registerVo.getPhone(), "电话号码不能为空！");
        Assert.isNull(registerVo.getVerificationCode(), "验证码不能为空！");
    }


    @Override
    public ResultModel updateClient(UpdateClientVo updateClientVo) throws Exception {
        return null;
    }

    @Override
    public ResultModel getUserInfo() {
        ClientDo clientDo = baseMapper.selectById(TokenUtil.getUserId());
        clientDo.setPassword(null);
        return Result.successResultModel(clientDo);
    }

    @Override
    public ResultModel getRole() throws Exception {
        List<RoleDo> roleDos = userInfoUtil.getUserRole(TokenUtil.getUserId());
        if (roleDos.size() <= 0) throw new Exception("没有用户信息！");
        List<String> roleDesc = roleDos.stream().map(RoleDo::getRoleDesc).collect(Collectors.toList());
        return Result.successResultModel(roleDesc);
    }

    @Override
    public ResultModel obtainShortMessageVerification(ObtainShortMessageVerificationVo obtainShortMessageVerificationVo) throws Exception {
        if (obtainShortMessageVerificationVo.getPhone().length() != 11)
            throw new Exception("请输入正确手机号！");
        String code = NoUtil.verificationCode();
        log.info("手机号码：[{}] 的验证码是：[{}]", obtainShortMessageVerificationVo.getPhone(), code);
        sendMessageUtil.getCredential(BaseUtil.formatMessagePhone(obtainShortMessageVerificationVo.getPhone()), ShortMessageIdEnum.REGISTER.id, code, "1");
        redisUtil.set(code, obtainShortMessageVerificationVo.getPhone(), 60);
        log.info("redis 中验证码：[{}] 对应的手机号是：[{}]", code, redisUtil.get(code));
        return Result.successResultModel();
    }

}
