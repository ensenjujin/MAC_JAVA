package com.akechiko.demo1;

public class Girlfriend {
    private String name;
    private int h;
    private int w;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void showName(){
        System.out.println(this.name);
    }

    public void showH(){
        System.out.println(this.h);
    }

    public void showW(){
        System.out.println(this.w);
    }

    public void wash(){
        System.out.println("洗衣服");
    }

    public void cook(){
        System.out.println("做饭");
    }
}
