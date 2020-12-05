package com.shop.service;

import com.shop.mapper.ClientRoleRelationDoMapper;
import com.shop.mapper.RoleDoMapper;
import com.shop.pojo.ClientRoleRelationDo;
import com.shop.pojo.RoleDo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public abstract class AbsService {

    @Autowired
    private ClientRoleRelationDoMapper clientRoleRelationDoMapper;

    @Autowired
    private RoleDoMapper roleDoMapper;


    /**
     * 获取用户角色集合
     * @param userId 用户id
     * @return
     * @throws Exception
     */
    public List<RoleDo> getUserRole(Long userId) throws Exception {
        log.info("id为 [{}] 获取角色信息", userId);
        ClientRoleRelationDo clientRoleRelationDo = new ClientRoleRelationDo();
        clientRoleRelationDo.setFkClientId(userId);
        clientRoleRelationDo.setIsDel("n");
        List<ClientRoleRelationDo> clientRoleRelationDos = clientRoleRelationDoMapper.selectObjectListByWhere(clientRoleRelationDo);
        if (clientRoleRelationDos.size() <= 0) throw new Exception("您没有角色信息！");
        List<RoleDo> roleDos = new ArrayList<>();
        clientRoleRelationDos.stream().forEach(k -> {
            RoleDo roleDo = roleDoMapper.selectByPrimaryKey(k.getFkRoleId());
            if (roleDo == null) log.info("没有找到角色id是 [{}] 的角色信息！", k.getFkRoleId());
            roleDos.add(roleDo);
        });
        return roleDos;
    }


}
