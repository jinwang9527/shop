package com.shop.service.client.impl;

import com.shop.common.TokenUtil;
import com.shop.mapper.ClientDoMapper;
import com.shop.mapper.ClientRoleRelationDoMapper;
import com.shop.mapper.RoleDoMapper;
import com.shop.pojo.ClientDo;
import com.shop.pojo.ClientRoleRelationDo;
import com.shop.pojo.RoleDo;
import com.shop.result.Result;
import com.shop.result.util.ResultModel;
import com.shop.service.AbsService;
import com.shop.service.client.ClientService;
import com.shop.vo.client.LoginVo;
import com.shop.vo.client.RegisterVo;
import com.shop.vo.client.UpdateClientVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ClientServiceImpl extends AbsService implements ClientService {

    @Autowired
    private ClientDoMapper clientDoMapper;


    @Override
    public ResultModel login(LoginVo loginVo) throws Exception {
        if (loginVo.getAccount() == null) return Result.errorResultModel("登录失败！账号不能为空");
        if (loginVo.getPassword() == null) return Result.errorResultModel("登录失败！密码不能为空！");
        ClientDo clientDo = new ClientDo();
        clientDo.setAccount(loginVo.getAccount());
        clientDo.setIsDel("n");
        List<ClientDo> clientDos = clientDoMapper.selectObjectListByWhere(clientDo);
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
        ClientDo clientDo = clientDoMapper.selectByPrimaryKey(TokenUtil.getUserId());
        clientDo.setPassword(null);
        return Result.successResultModel(clientDo);
    }

    @Override
    public ResultModel getRole() throws Exception {
        List<RoleDo> roleDos = super.getUserRole(TokenUtil.getUserId());
        if (roleDos.size() <= 0) throw new Exception("没有用户信息！");
        List<String> roleDesc = roleDos.stream().map(RoleDo::getRoleDesc).collect(Collectors.toList());
        return Result.successResultModel(roleDesc);
    }


}
