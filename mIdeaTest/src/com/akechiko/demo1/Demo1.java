package com.akechiko.demo1;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Person person=new SuperMan();
        person.eat();
        person.work();

        SuperMan superMan=(SuperMan) person;
        superMan.save();
    }
}
