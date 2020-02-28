package com.example.ssm_test01.entity;

public class Person {
    private String name;
    private int id;
    private int age;
    public Person() {
    }

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "名字是'" + name + '\'' +
                ", id是" + id +
                ", 年龄是" + age +
                '}';
    }
}