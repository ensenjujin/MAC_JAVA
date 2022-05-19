package com.akechiko.demo1;

public class Foodie extends Thread{
    private Desk desk;
    public Foodie(Desk desk) {
        this.desk=desk;
    }
    @Override
    public void run() {
        while (true){
            synchronized (desk.getLock()){
                if (desk.getCount()==0){
                    break;
                }else{
                    if (desk.isFlag()){
                        System.out.println("吃货在吃汉堡包");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();
                        desk.setCount(desk.getCount()-1);
                    }else {
                        //没有就等待
                        //使用什么对象当作锁，那么就必须用这个对象去调用等待和唤醒的方法。
                        try {
                            desk.getLock().wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
