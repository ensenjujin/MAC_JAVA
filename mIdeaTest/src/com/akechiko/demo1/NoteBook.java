package com.akechiko.demo1;

public class NoteBook implements USB{
    @Override
    public void start() {
        System.out.println("开机功能");
    }

    @Override
    public void stop() {
        System.out.println("关机功能");
    }

    public void useUSB(USB u){
        u.start();
        u.stop();
    }
}
