package com.shop.service;

import com.shop.common.result.util.ResultModel;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.entity.ClientDo;
import com.shop.vo.client.LoginVo;
import com.shop.vo.client.ObtainShortMessageVerificationVo;
import com.shop.vo.client.RegisterVo;
import com.shop.vo.client.UpdateClientVo;

/**
 * <p>
 * 客户表 服务类
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-16
 */
public interface ClientService extends IService<ClientDo> {

    /**
     * 用户登录
     *
     * @param loginVo
     * @return
     * @throws Exception
     */
    ResultModel login(LoginVo loginVo) throws Exception;

    /**
     * 用户注册
     *
     * @param registerVo
     * @return
     * @throws Exception
     */
    ResultModel register(RegisterVo registerVo) throws Exception;

    /**
     * 修改客户信息
     *
     * @param updateClientVo
     * @return
     */
    ResultModel updateClient(UpdateClientVo updateClientVo) throws Exception;

    /**
     * 查询客户信息
     *
     * @return
     */
    ResultModel getUserInfo()throws Exception;

    /**
     * 查询客户角色
     *
     * @return
     */
    ResultModel getRole()throws Exception;

    /**
     * 发送注册短信验证
     *
     * @return
     */
    ResultModel obtainShortMessageVerification(ObtainShortMessageVerificationVo obtainShortMessageVerificationVo)throws Exception;
}
