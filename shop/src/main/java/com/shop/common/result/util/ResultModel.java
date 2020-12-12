package com.shop.common.result.util;

import lombok.Data;

@Data
public class ResultModel {

    private Integer code;

    private Object data;

    private String message;


    public ResultModel(){

    }

    public ResultModel(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public ResultModel(Integer code,Object data,String message){
        this.code = code;
        this.data = data;
        this.message = message;
    }



}
