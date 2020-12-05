package com.shop.vo.client;

import lombok.Data;

@Data
public class LoginVo {

    /* 账号 */
    private String account;

    /* 密码 */
    private String password;

    /* 登录标志  0 ：买家登录，1：商家登录 */
    private String loginSign;

}
