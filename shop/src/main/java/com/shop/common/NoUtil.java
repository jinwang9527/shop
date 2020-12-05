package com.shop.common;

import com.shop.shopEnum.NoEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 编号生成器
 */
public class NoUtil {

    public static String generator(NoEnum noEnum) {
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("yMdHms");
        LocalDateTime ldt = LocalDateTime.now();
        String code = df4.format(ldt);
        return String.format("%s%s", noEnum.prefix, code);
    }

}
