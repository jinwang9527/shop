package com.shop.vo.client;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginVo {

    /* 账号 */
    @NotEmpty(message = "账号不能为空！")
    private String account;

    /* 密码 */
    @NotEmpty(message = "密码不能为空！")
    private String password;

    /* 登录标志  0 ：买家登录，1：商家登录 */
    private String loginSign;

}
