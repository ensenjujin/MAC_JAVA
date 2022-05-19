package com.akechiko.demo1;

public class Cooker extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }else {
                    if (!Desk.flag){
                        System.out.println("厨师在做汉堡");
                        Desk.flag=true;
                        Desk.lock.notifyAll();
                       // Desk.count++;
                    }else {
                        //没有就等待
                        //使用什么对象当作锁，那么就必须用这个对象去调用等待和唤醒的方法。
                        try {
                            Desk.lock.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }

            }
        }
    }
}
