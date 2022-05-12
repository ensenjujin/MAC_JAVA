package com.akechiko.demo1;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        InterIpml ipml=new InterIpml();
        System.out.println(Inter.num);
        ipml.method();
    }
}

interface Inter{
    int num=10;
    void method();
}

