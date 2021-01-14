package com.shop.common;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SendMessageUtilTest {

    @Autowired
    private SendMessageUtil sendMessageUtil;

    @Test
    void getCredential()throws Exception {
        List<String> list = new ArrayList<>();
        list.add("+8619866986467");
        sendMessageUtil.getCredential(list,"836349","789455");
    }
}