package com.akechiko.demo1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.SimpleFormatter;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args)  {
        MyThread m1=new MyThread();
        m1.start();

        for (int i = 0; i < 100; i++) {
            if ((i+1)%2==1){
                System.out.println("主线程："+(i+1));
            }
        }
    }
}
