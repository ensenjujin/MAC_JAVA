package com.akechiko.demo1;

public class Mouse implements USB{
    @Override
    public void start() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void stop() {
        System.out.println("断开鼠标的USB");
    }
}
