package com.akechiko.demo1;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);

        DatagramSocket ds=new DatagramSocket();
        while (true) {
            String s=sc.nextLine();
            if ("886".equals(s)){
                break;
            }
            byte[] bytes=s.getBytes();
            int port=10000;
            InetAddress address=InetAddress.getByName("127.0.0.1");

            DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);
            ds.send(dp);
        }
        ds.close();
    }
}
