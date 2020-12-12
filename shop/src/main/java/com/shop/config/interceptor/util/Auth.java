package com.shop.config.interceptor.util;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Target({METHOD, PACKAGE, PARAMETER, TYPE})
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Auth {


    String permissions() default "";


}
