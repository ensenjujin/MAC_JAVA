package com.akechiko.demo1;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ArrayBlockingQueue;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        String s="炸弹";
        byte[] bytes=s.getBytes();
        InetAddress address=InetAddress.getByName("127.0.0.1");
        int port=10000;
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);

        ds.send(dp);

        ds.close();
    }
}
