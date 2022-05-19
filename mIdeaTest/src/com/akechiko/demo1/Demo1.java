package com.akechiko.demo1;

public class Demo1 {
    public static void main(String[] args)  {
        Desk desk=new Desk();
        Foodie f=new Foodie(desk);
        Cooker c=new Cooker(desk);
        f.start();
        c.start();
    }
}
