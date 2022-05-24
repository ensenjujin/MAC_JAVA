package com.akechiko.demo1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UUIDDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("mIdeaTest/src/number1.txt"));
        String line=null;
        List<String> list=new ArrayList<>();
        while ((line= br.readLine())!=null) {
            list.add(line);
        }
        br.close();

        int[] arr=new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i]=Integer.parseInt(list.get(i));
        }
        Arrays.sort(arr);

        BufferedWriter bw=new BufferedWriter(new FileWriter("mIdeaTest/src/number2.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+"\n");
            bw.flush();
        }
        bw.close();
    }
}
