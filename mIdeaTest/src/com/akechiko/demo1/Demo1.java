package com.akechiko.demo1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.SimpleFormatter;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args)  {
        MyThread m1=new MyThread();
        m1.start();

        MyRunnable mr=new MyRunnable();
        Thread th=new Thread(mr);
        th.start();
    }
}
