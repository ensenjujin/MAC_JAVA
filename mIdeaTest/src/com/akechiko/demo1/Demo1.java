package com.akechiko.demo1;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Demo1 {
    public static void main(String[] args)  {
        TreeSet<Student> ts=new TreeSet<>();

        Student s1=new Student("zhangsan",80,80,80);
        Student s2=new Student("lisi",90,90,90);
        Student s3=new Student("wangwu",100,100,100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student student:ts){
            System.out.println(student);
        }
    }
}
