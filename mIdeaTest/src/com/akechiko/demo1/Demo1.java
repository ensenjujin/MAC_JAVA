package com.akechiko.demo1;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int word=0;
        int number=0;

        String s=scanner.nextLine();
        s=s.toLowerCase();
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)>='a' && s.charAt(i) <='z'){
                word++;
            }else if (s.charAt(i)>='0' && s.charAt(i) <='9'){
                number++;
            }
        }
        System.out.println(word);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
    }
}
