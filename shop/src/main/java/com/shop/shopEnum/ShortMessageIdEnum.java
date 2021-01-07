package com.shop.shopEnum;

public enum ShortMessageIdEnum {

    REGISTER("836740", "注册");


    ShortMessageIdEnum(String id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public String id;

    public String desc;

}
