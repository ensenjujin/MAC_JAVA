package com.akechiko.demo1;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        NoteBook noteBook=new NoteBook();
        noteBook.start();
        noteBook.useUSB(new Mouse());
        noteBook.stop();
    }
}

