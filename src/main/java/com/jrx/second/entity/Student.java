package com.jrx.second.entity;

import java.io.Serializable;

/**
 * 创建Student类
 *
 * @Author: sunchuanyin
 * @Date: 2019/3/25 22:15
 * @Version 1.0
 */
public class Student implements Serializable {


    private static final long serialVersionUID = -1972951228361786779L;

    // 分数
    private Double Score;
    // 年龄
    private Integer age;
    // 性别
    private String sex;
    // 年级
    private String grade;
    // 姓名
    private String name;

    public Student(Double score, Integer age, String sex, String grade, String name) {
        Score = score;
        this.age = age;
        this.sex = sex;
        this.grade = grade;
        this.name = name;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Score=" + Score +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
