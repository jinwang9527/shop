package com.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.common.TokenUtil;
import com.shop.common.result.Result;
import com.shop.common.result.util.ResultModel;
import com.shop.entity.ClientDo;
import com.shop.entity.RoleDo;
import com.shop.mapper.ClientDoMapper;
import com.shop.service.ClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.common.UserInfoUtil;
import com.shop.vo.client.LoginVo;
import com.shop.vo.client.RegisterVo;
import com.shop.vo.client.UpdateClientVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
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


}
