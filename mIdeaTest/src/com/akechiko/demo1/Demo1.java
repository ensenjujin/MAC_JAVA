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
        HashSet<Student> ts=new HashSet<>();

        Student s1=new Student("zhangsan",80);
        Student s2=new Student("lisi",100);
        Student s3=new Student("wangwu",100);
        Student s4=new Student("wangwu",100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student student:ts){
            System.out.println(student);
        }
    }
}
