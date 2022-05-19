package com.akechiko.demo1;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if ((i+1)%2==0){

                System.out.println(i+1);
            }
        }
    }
}
