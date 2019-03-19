package com.jrx.demo.reference.method;

import java.io.Serializable;

/**
 * @Author: sunchuanyin
 * @Date: 2019/3/18 22:39
 * @Version 1.0
 */
public class Person implements Serializable {


    private static final long serialVersionUID = -1353293113511788144L;

    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
