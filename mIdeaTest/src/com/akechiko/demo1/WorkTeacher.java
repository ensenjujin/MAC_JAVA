package com.akechiko.demo1;

public class WorkTeacher extends Teacher{
    public WorkTeacher(String name, int age) {
        super(name, age);
    }

    public WorkTeacher() {
    }

    @Override
    public void teach() {
        System.out.println("就业班老师讲JavaSE");
    }
}
