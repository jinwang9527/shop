package com.shop.controller;

import com.shop.mapper.ClientDoMapper;
import com.shop.pojo.ClientDo;
import com.shop.result.Result;
import com.shop.result.util.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ClientDoMapper clientDoMapper;


    @RequestMapping("getTest")
    public String getTest() {
        return "Hello Word";
    }


    @RequestMapping("login")
    public String login() {
        return "Hello login";
    }

    @RequestMapping("testDataBase")
    public ResultModel testDataBase(){
        ClientDo clientDo = clientDoMapper.selectByPrimaryKey(1L);
        return Result.successResultModel(clientDo);
    }
}
