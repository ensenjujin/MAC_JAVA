package com.akechiko.demo1;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket socket=new ServerSocket(10000);
        Socket accept=socket.accept();
        InputStream is=accept.getInputStream();
        int b;
        while ((b=is.read())!=-1){
            System.out.println((char) b);
        }

//        OutputStream os =accept.getOutputStream();
//        os.write("你谁呀？".getBytes());
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("你谁呀？");
        bw.newLine();
        bw.flush();

        bw.close();
        is.close();
        accept.close();
        socket.close();
    }
}
