package com.jrx.demo.stream;

import java.util.stream.Stream;

/**
 * Stream中的合并方法
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/18 23:24
 * @Version 1.0
 */
public class StreamContactDemo {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("1", "2", "3");
        Stream<String> stream2 = Stream.of("A", "B", "C");
        // 合并流
        Stream<String> concatStream = Stream.concat(stream1, stream2);
        concatStream.forEach(string -> System.out.println(string));
    }
}
