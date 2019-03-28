package com.jrx.text.regex;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * 练习java.util.regex.Pattern中的方法
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/27 16:02
 * @Version 1.0
 */
public class PatternTest {

    @Test
    public void patternTest() {
        // 指定匹配规则   匹配字符（没有数字）
        String regex = "\\d+";
        // 获得Pattern对象
        Pattern pattern = Pattern.compile(regex);
        System.out.println("指定的匹配规则是：" + regex);

        // 根据匹配规则分割
        String[] split = pattern.split("我是：123你是：456");
        for (String str : split) {
            System.out.println(str);
        }

        // 验证指定的数据是否符合指定的匹配规则
        boolean isMatch = Pattern.matches(regex, "hello");
        System.out.println("指定的数据是否匹配：" + isMatch);
    }
}
