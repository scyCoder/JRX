package com.jrx.text;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * @Author: sunchuanyin
 * @Date: 2019/3/25 14:25
 * @Version 1.0
 */
public class RegexTest {

    /**
     * 验证手机号码
     */
    @Test
    public void phoneNumberTest() {
        /**
         *  ^: 开头，表示第一位（在这里表示第一位是1）
         *  \: 或者
         *  []：表示出现其中的任意一个字符
         *  [3|4|5|7|8]：表示第二位匹配3或者4或者5或者7或者8
         *  [0-9]：匹配0-9之间的数字
         *  {9}：表示有9位数
         *  [0-9]{9}：表示手机号的后九位在0-9之间
         *  $：字符串结尾标志
         */
        // 验证手机号的验证规则
        String phoneNumberRegex = "^1[3|4|5|7|8][0-9]{9}$";
        // 需要验证的手机号码
        String phoneNumber = "15294673637";
        // 使用Pattern对象中的静态matches方法验证手机号码是否正确
        boolean isMatch = Pattern.matches(phoneNumberRegex, phoneNumber);
        System.out.println("输入的手机号码格式是否正确？" + isMatch);
    }

    /**
     * 验证email
     */
    @Test
    public void emailTest() {

        /**
         * \w：表示匹配任何字类字符，包括下划线
         * +：表示一次或多次匹配前面的字符或者子表达式
         * *：表示前面的条目出现0次或多次
         */
        // email的验证规则
        String emailRegex = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String email = "15294673637@qq.com";
        boolean isMatch = Pattern.matches(emailRegex, email);
        System.out.println("输入的email格式是否正确？" + isMatch);
    }

    /**
     * 验证密码
     */
    @Test
    public void passwordTest() {

        /**
         * .*：表示单个字符匹 配任意次
         * (?=.*[0-9].*)表示：任意字符串中有数字
         * {6，20}：表示长度最少6个，最多20个
         */
        // 密码的验证规则
        String passwordRegex = "^(?=.*[0-9].*)(?=.*[A-Z].*)(?=.*[a-z].*).{6,20}$";
        String password = "asd4Y11";
        boolean isMatch = Pattern.matches(passwordRegex, password);
        System.out.println("输入的email格式是否正确？" + isMatch);
    }

}
