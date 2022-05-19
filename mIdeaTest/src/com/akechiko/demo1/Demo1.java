package com.akechiko.demo1;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String > arrayBlockingQueue=new ArrayBlockingQueue<>(1);

        Cooker c=new Cooker(arrayBlockingQueue);
        Foodie f=new Foodie(arrayBlockingQueue);

        c.start();
        f.start();

    }
}
