package com.java.Test01;

/**
 * @author Wxin
 * @create 2018-09-19
 */
public class Student extends Person{
    private double math;
    private double english;

    public Student() {
    }

    public Student(double math, double english) {
        this.math = math;
        this.english = english;
    }

    public Student(String name, String address, char sex, int age, double math, double english) {
        super.print();
        this.math = math;
        this.english = english;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(this.math + this.english);
    }
}
