package com.akechiko.demo1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Demo1 {
    public static void main(String[] args)  {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        System.out.println(listTest(list,333));
    }

    public static int listTest(ArrayList<Integer>al,Integer s){
        int retu=-1;
        for (int i = 0; i < al.size(); i++) {
             retu =al.get(i).equals(s) ?  i : -1;
        }
        return retu;
    }


}
