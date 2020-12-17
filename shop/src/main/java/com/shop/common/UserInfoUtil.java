package com.shop.common;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.entity.ClientRoleRelationDo;
import com.shop.entity.RoleDo;
import com.shop.mapper.ClientRoleRelationDoMapper;
import com.shop.mapper.RoleDoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service("userInfoUtil")
public class UserInfoUtil{

    @Autowired
    private RoleDoMapper roleDoMapper;

    @Autowired
    private ClientRoleRelationDoMapper clientRoleRelationDoMapper;


    /**
     * 获取用户角色集合
     * @param userId 用户id
     * @return
     * @throws Exception
     */
    public List<RoleDo> getUserRole(Long userId) throws Exception {
        log.info("id为 [{}] 获取角色信息", userId);
        QueryWrapper<ClientRoleRelationDo> wrapper = new QueryWrapper<>();
        wrapper.eq("fk_client_id",userId).eq("is_del","n");
        List<ClientRoleRelationDo> clientRoleRelationDos = clientRoleRelationDoMapper.selectList(wrapper);
        if (clientRoleRelationDos.size() <= 0) throw new Exception("您没有角色信息！");
        List<RoleDo> roleDos = new ArrayList<>();
        clientRoleRelationDos.stream().forEach(k -> {
            RoleDo roleDo = roleDoMapper.selectById(k.getFkRoleId());
            if (roleDo == null) log.info("没有找到角色id是 [{}] 的角色信息！", k.getFkRoleId());
            roleDos.add(roleDo);
        });
        return roleDos;
    }


}
