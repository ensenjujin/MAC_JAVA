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
        TreeMap<Student,String>hm=new TreeMap<>();

        Student s1=new Student("小黑",22);
        Student s2=new Student("小vl",24);
        Student s3=new Student("小bai",29);

        hm.put(s1,"江苏");
        hm.put(s2,"上海");
        hm.put(s3,"哈尔滨");

        for (Student key:hm.keySet()){
            System.out.println(key+"----"+hm.get(key));
        }

        for (Map.Entry<Student,String> entry:hm.entrySet()){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

        hm.forEach((Student key,String value)->{
            System.out.println(key+"-----"+value);
        });
    }
}
