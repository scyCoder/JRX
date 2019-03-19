package com.jrx.demo.type.annotation;

import java.io.Serializable;

/**
 * @Author: sunchuanyin
 * @Date: 2019/3/19 0:58
 * @Version 1.0
 */
// 用在实现接口的类上
@TypeAnnotation.NotNull
public class TypeAnnotationDemo implements Serializable {

    public static void main(String[] args) {

        // 用在类型转换上
        Object object = "hello";
        String string = (@TypeAnnotation.NotNull String) object;
    }
}
