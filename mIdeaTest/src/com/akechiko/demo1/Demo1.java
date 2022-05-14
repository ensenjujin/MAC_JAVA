package com.akechiko.demo1;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        System.out.println(sumNumber(20));
    }

    public static int sumNumber(int a){

        if (a==1 || a==2){
            return 1;
        }
        return  sumNumber(a-2)+sumNumber(a-1);
    }
}
