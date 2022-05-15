package com.akechiko.demo1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Demo1 {
    public static void main(String[] args)  {
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(listTest(list,"aaa"));
    }

    public static boolean listTest(ArrayList<String>al,String s){
        return al.contains(s);
    }


}
