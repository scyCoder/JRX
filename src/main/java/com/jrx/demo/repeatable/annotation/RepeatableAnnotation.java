package com.jrx.demo.repeatable.annotation;

import java.lang.annotation.*;

/**
 * 重复注解
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/19 0:32
 * @Version 1.0
 */
public class RepeatableAnnotation {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class)
    public @interface Filter {
        String value();
    }
}
