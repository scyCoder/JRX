package com.jrx.text.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 练习java.util.regex.Matcher中的方法
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/25 17:34
 * @Version 1.0
 */
public class MatcherTest {

    /**
     * 根据捕获组获得匹配的一组数据
     */
    @Test
    public void hello() {
        // 指定是需要验证的数据
        String world = "hello world 123Q sun!";
        // 指定需要验证的规则
        String regex = "(\\D*)(\\d+)(.*)";
        // 获得一个编译模式
        Pattern pattern = Pattern.compile(regex);
        // 获得Mathcer
        Matcher matcher = pattern.matcher(world);

        // find方法是验证的数据是否有我们需要的数据
        boolean isFind = matcher.find();
        System.out.println("验证的数据是否有我们需要的数据？" + isFind);

        // 获得捕获组的个数
        int count = matcher.groupCount();
        System.out.println("获得捕获组的个数为：" + count);

        // 根据组数获得额我们需要的数据
        String data = matcher.group(2);
        System.out.println("获得数据是：" + data);
        // 返回匹配最后一个字符的偏移量（最后字符的索引+1）
        int end = matcher.end();
        System.out.println("最后一个字符的偏移量" + end);

        // 是否匹配
        boolean isMathches = matcher.matches();
        System.out.println("是否匹配：" + isMathches);

        // 判断匹配的字符串是否在最前面
        boolean isBefore = matcher.lookingAt();
        System.out.println("匹配的字符串是否在最前面：" + isBefore);

    }
}
