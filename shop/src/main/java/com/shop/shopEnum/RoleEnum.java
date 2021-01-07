package com.shop.shopEnum;

public enum RoleEnum {

    BUYER(1L, "Buyer", "买家"),
    SELLER(2L, "Seller", "卖家");

    RoleEnum(Long id, String code, String desc) {
       this.id = id;
       this.code = code;
       this.desc = desc;
    }

    public Long id;

    public String code;

    public String desc;

}
