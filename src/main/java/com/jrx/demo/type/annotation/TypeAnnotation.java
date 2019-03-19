package com.jrx.demo.type.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 类型注解
 * jdk8为ElementType枚举增加了两个枚举值：T
 * YPE_PARAMETER   可以用在参数上
 * TYPE_USE    可以用在任何地方
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/19 0:48
 * @Version 1.0
 */
public class TypeAnnotation {

    @Target(ElementType.TYPE_USE)
    @interface NotNull {

    }
}
