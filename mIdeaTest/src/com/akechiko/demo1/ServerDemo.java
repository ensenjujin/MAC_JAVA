package com.akechiko.demo1;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        while (true) {
            Socket accept=ss.accept();
            ThreadSocket ts=new ThreadSocket(accept);
            new Thread(ts).start();
        }
//        ss.close();
    }
}
