package com.akechiko.demo1;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        BaseTeacher baseTeacher=new BaseTeacher("张三老师",23);
        System.out.println(baseTeacher.getName()+"....."+baseTeacher.getAge());
        baseTeacher.teach();

        WorkTeacher workTeacher=new WorkTeacher("李四老师",24);
        System.out.println(workTeacher.getName()+"....."+workTeacher.getAge());
        workTeacher.teach();
    }
}
