package com.shop.shopEnum;

public enum  NoEnum {

    ORDER(1,"R"),

    CLIENT(2,"C");



    NoEnum(Integer code,String prefix){
        this.code = code;
         this.prefix = prefix;
    }

    public Integer code;

    public String prefix;

}
