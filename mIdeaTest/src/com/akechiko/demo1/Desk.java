package com.akechiko.demo1;

public class Desk {
    //定义一个标记
    //true 表示桌子上有东西，此时允许吃货执行
    //false 表示桌子上没有东西，此时允许厨师执行
    //public static boolean flag=false;
    private boolean flag;

    public Desk() {
        this(false,10);
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    //public static int count=10;
    private int count;

//    public static final Object lock=new Object();
    private final Object lock=new Object();
}
