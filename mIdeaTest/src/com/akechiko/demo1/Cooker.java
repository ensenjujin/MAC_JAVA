package com.akechiko.demo1;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread{
    private Desk desk;
    public Cooker(Desk desk) {
        this.desk=desk;
    }
    private ArrayBlockingQueue<String>arrayBlockingQueue;
    public Cooker(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.arrayBlockingQueue=arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                arrayBlockingQueue.put("汉堡包");
                System.out.println("厨师放汉堡包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
