package com.shop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class test {

    @RequestMapping("getTest")
    public String getTest() {
        return "Hello Word";
    }
}
