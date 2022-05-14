package com.akechiko.demo1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        String str="2018-03-04";
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        Date now=sf.parse(str);
        SimpleDateFormat sf1=new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sf1.format(now));
    }

}
