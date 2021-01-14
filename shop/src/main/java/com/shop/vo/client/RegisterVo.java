package com.shop.vo.client;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class RegisterVo {

    @NotEmpty(message = "客户姓名不能为空！")
    private String clientName;

    @NotEmpty(message = "客户电话不能为空")
    private String phone;

    @NotEmpty(message = "客户验证码不能为空")
    private String verificationCode;

    @NotEmpty(message = "客户密码不能为空")
    private String password;
}
