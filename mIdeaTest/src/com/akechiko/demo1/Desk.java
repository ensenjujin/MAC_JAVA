package com.akechiko.demo1;

public class Desk {
    //定义一个标记
    //true 表示桌子上有东西，此时允许吃货执行
    //false 表示桌子上没有东西，此时允许厨师执行
    public static boolean flag=false;

    public static int count=10;

    public static final Object lock=new Object();
}
