package com.akechiko.demo1;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Fu fu=new Zi();
        System.out.println(fu.num);
        fu.method();
        Zi zi=(Zi) fu ;
        zi.show();
    }
}

class Fu{
    int num=10;

    public void method(){
        System.out.println("父类的method方法");
    }
}

class Zi extends Fu{
    int num=10;
    public void method(){
        System.out.println("子类的method方法");
    }
    public void show(){
        System.out.println("子类的show方法");
    }
}

