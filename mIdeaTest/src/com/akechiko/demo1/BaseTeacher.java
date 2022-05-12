package com.akechiko.demo1;

public class BaseTeacher extends Teacher{
    public BaseTeacher(String name, int age) {
        super(name, age);
    }

    public BaseTeacher() {
    }

    @Override
    public void teach() {
        System.out.println("基础班老师讲JAVASE");
    }
}
