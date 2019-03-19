package com.jrx.demo.repeatable.annotation;

/**
 * @Author: sunchuanyin
 * @Date: 2019/3/19 0:44
 * @Version 1.0
 */
public class RepeatableAnnotationDemo {

    public static void main(String[] args) {

        // 利用反射和getAnnotationsByType获得重复注解
        for (RepeatableAnnotation.Filter filter : Filterable.class.getAnnotationsByType(RepeatableAnnotation.Filter
                .class)) {
            System.out.println(filter.value());
        }
    }
}
