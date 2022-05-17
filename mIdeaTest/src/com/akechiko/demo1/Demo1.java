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
//        File file   =new File(".");
//        System.out.println(file.getAbsolutePath());

        File file=new File("mIdeaTest/bbb");
        if (!file.exists()){
            file.mkdirs();
        }
        File newFile=new File(file,"a.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
