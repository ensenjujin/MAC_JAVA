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
        Integer[] a={1,2,3,4,5,6};
        listTest(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static <T> void listTest(T[] al){
        for (int min=0,max=al.length-1;min<max; min++,max--){
            T tmp=al[min];
            al[min]=al[max];
            al[max]=tmp;
        }
    }


}
