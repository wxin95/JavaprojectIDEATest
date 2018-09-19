package com.java.Test01;

/**
 * @author Wxin
 * @create 2018-09-19
 */
public class Person {
    protected String name;
    protected String address;
    protected char sex;
    protected int age;

    public Person() {
    }

    public Person(String name, String address, char sex, int age) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    public void print(){
        System.out.println(this.name + this.address + this.sex + this.age);
    }
    //滑稽的一b
}
