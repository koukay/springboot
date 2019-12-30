package com.houkai.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person1 {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private String sex;
    @Value("${person.desc}")
    private String desc;

    public Person1() {
    }

    public Person1(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}