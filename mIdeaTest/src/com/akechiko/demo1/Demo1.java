package com.akechiko.demo1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Demo1 {
    public static void main(String[] args)  {
        Collection <Integer> collections=new ArrayList<>();
        collections.add(666);
        collections.add(111);
        collections.add(222);

        Object[] objects=collections.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }



}
