package com.shop.common;

import com.shop.shopEnum.NoEnum;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 编号生成器
 */
public class NoUtil {

    /**
     * 生成编号
     *
     * @param noEnum
     * @return
     */
    public static String generator(NoEnum noEnum) {
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("yMdHms");
        LocalDateTime ldt = LocalDateTime.now();
        String code = df4.format(ldt);
        return String.format("%s%s", noEnum.prefix, code);
    }

    /**
     * 生成6位验证码
     *
     * @return
     */
    public static String verificationCode() {
        return RandomStringUtils.randomNumeric(6);
    }

}
