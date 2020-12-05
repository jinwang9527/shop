package com.shop.shopEnum;

public enum ResultEnum {

    SUCCESS(0, "请求成功"),
    Fail(1, "请求失败"),
    TOKEN_OVERDUE(2, "无效的token");

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code;

    public String message;
}
