package com.shop.service.impl;

import com.shop.service.ClientService;
import com.shop.vo.client.ObtainShortMessageVerificationVo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClientServiceImplTest {

    @Autowired
    private ClientService clientService;

    @Test
    void login() {
    }

    @Test
    void register() {
    }

    @Test
    void updateClient() {
    }

    @Test
    void getUserInfo() {
    }

    @Test
    void getRole() {
    }

    @Test
    void obtainShortMessageVerification()throws Exception {
        ObtainShortMessageVerificationVo obtainShortMessageVerificationVo = new ObtainShortMessageVerificationVo();
        obtainShortMessageVerificationVo.setPhone("19866986467");
        clientService.obtainShortMessageVerification(obtainShortMessageVerificationVo);
    }
}