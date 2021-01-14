package com.shop.controller;


import com.shop.common.SendMessageUtil;
import com.shop.common.result.Result;
import com.shop.common.result.util.ResultModel;
import com.shop.config.interceptor.util.Auth;
import com.shop.service.ClientService;
import com.shop.vo.client.LoginVo;
import com.shop.vo.client.ObtainShortMessageVerificationVo;
import com.shop.vo.client.RegisterVo;
import com.shop.vo.client.UpdateClientVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author 靳 旺
 * @since 2020-12-16
 */
@Slf4j
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @ResponseBody
    @RequestMapping("/login")
    public ResultModel login(@RequestBody @Valid LoginVo loginVo,BindingResult result) throws Exception {
        if (result.hasErrors()) return Result.errorResultModel(result.getAllErrors());
        return clientService.login(loginVo);
    }

    @ResponseBody
    @RequestMapping("register")
    public ResultModel register(@RequestBody @Valid RegisterVo registerVo, BindingResult result) throws Exception {
        if (result.hasErrors())  return Result.errorResultModel(result.getAllErrors());
        return clientService.register(registerVo);
    }

    @Auth(permissions = "admin")
    @ResponseBody
    @RequestMapping("updateClient")
    public ResultModel updateClient(@RequestBody UpdateClientVo updateClientVo) throws Exception {
        return clientService.updateClient(updateClientVo);
    }

    @ResponseBody
    @RequestMapping("getUserInfo")
    public ResultModel getUserInfo() throws Exception {
        return clientService.getUserInfo();
    }

    @ResponseBody
    @RequestMapping("getRole")
    public ResultModel getRole() throws Exception {
        return clientService.getRole();
    }

    @ResponseBody
    @RequestMapping("obtainShortMessageVerification")
    public ResultModel obtainShortMessageVerification(@RequestBody ObtainShortMessageVerificationVo obtainShortMessageVerificationVo) throws Exception{
        return clientService.obtainShortMessageVerification(obtainShortMessageVerificationVo);
    }




}
