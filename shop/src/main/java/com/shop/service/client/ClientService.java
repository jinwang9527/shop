package com.shop.service.client;

import com.shop.result.util.ResultModel;
import com.shop.service.BaseService;
import com.shop.vo.client.LoginVo;
import com.shop.vo.client.RegisterVo;
import com.shop.vo.client.UpdateClientVo;

public interface ClientService extends BaseService {


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
}
