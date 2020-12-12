package com.shop.common.result;

import com.shop.common.result.util.ResultModel;
import com.shop.shopEnum.ResultEnum;

public class Result {

    public static ResultModel successResultModel() {
        return new ResultModel(ResultEnum.SUCCESS.code, null, ResultEnum.SUCCESS.message);
    }


    public static ResultModel successResultModel(Object data) {
        return new ResultModel(ResultEnum.SUCCESS.code, data, ResultEnum.SUCCESS.message);
    }

    public static ResultModel successResultModel(Integer code,Object data,String message) {
        return new ResultModel(code, data,message);
    }

    public static ResultModel errorResultModel() {
        return new ResultModel(ResultEnum.Fail.code, null, ResultEnum.Fail.message);
    }

    public static ResultModel errorResultModel(Object data) {
        return new ResultModel(ResultEnum.Fail.code, data, ResultEnum.Fail.message);
    }

    public static ResultModel errorResultModel(String message) {
        return new ResultModel(ResultEnum.Fail.code, null, message);
    }

    public static ResultModel errorResultModel(Integer code,String message) {
        return new ResultModel(code, null,message);
    }

    public static ResultModel errorResultModel(Integer code,Object data,String message) {
        return new ResultModel(code, data,message);
    }
}
