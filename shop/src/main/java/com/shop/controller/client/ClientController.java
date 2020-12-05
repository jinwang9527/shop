package com.shop.controller.client;

import com.shop.result.util.ResultModel;
import com.shop.service.client.ClientService;
import com.shop.vo.client.LoginVo;
import com.shop.vo.client.RegisterVo;
import com.shop.vo.client.UpdateClientVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @ResponseBody
    @RequestMapping("/login")
    public ResultModel login(@RequestBody LoginVo loginVo)throws Exception{
        return clientService.login(loginVo);
    }


    @ResponseBody
    @RequestMapping("register")
    public ResultModel register(@RequestBody RegisterVo registerVo)throws Exception{
        return clientService.register(registerVo);
    }

    @ResponseBody
    @RequestMapping("updateClient")
    public ResultModel updateClient(@RequestBody UpdateClientVo updateClientVo)throws Exception{
        return clientService.updateClient(updateClientVo);
    }

    @ResponseBody
    @RequestMapping("getUserInfo")
    public ResultModel getUserInfo()throws Exception{
        return clientService.getUserInfo();
    }

    @ResponseBody
    @RequestMapping("getRole")
    public ResultModel getRole()throws Exception{
        return clientService.getRole();
    }


}
