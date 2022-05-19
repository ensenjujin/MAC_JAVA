package com.akechiko.demo1;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    private Desk desk;
    public Foodie(Desk desk) {
        this.desk=desk;
    }

    private ArrayBlockingQueue<String>arrayBlockingQueue;

    public Foodie(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.arrayBlockingQueue=arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = arrayBlockingQueue.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
