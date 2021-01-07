package com.shop.vo.client;

import lombok.Data;

@Data
public class RegisterVo {

    private String clientName;

    private String phone;

    private String verificationCode;

    private String password;
}
