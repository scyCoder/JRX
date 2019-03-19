package com.jrx.demo.stream;

import java.util.stream.Stream;

/**
 * Stream中的映射方法
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 23:27
 * @Version 1.0
 */
public class StreamMapDemo {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("1", "2", "3");
        Stream<Integer> integerStream = stringStream.map(Integer::parseInt);
        integerStream.forEach(integer -> System.out.println(integer));
    }
}
