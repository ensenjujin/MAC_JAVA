package com.akechiko.demo1;

public class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}