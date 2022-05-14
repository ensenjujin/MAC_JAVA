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
    public static void main(String[] args)  {
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(dateTime.format(dateTimeFormatter));
    }

}
