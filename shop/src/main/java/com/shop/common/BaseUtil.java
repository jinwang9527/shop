package com.shop.common;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class BaseUtil {

    /**
     * 批量格式化短信手机号码
     *
     * @return
     */
    public static List<String> formatMessagePhone(List<String> phones) {
        return phones.stream().map(k -> {
            return String.format("+86%s", k);
        }).collect(Collectors.toList());
    }

    /**
     * 单个格式化短信手机号码
     *
     * @return
     */
    public static String formatMessagePhone(String phone) {
        return String.format("+86%s", phone);
    }

}
