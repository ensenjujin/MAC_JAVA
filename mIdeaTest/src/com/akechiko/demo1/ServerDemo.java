package com.akechiko.demo1;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket accept=ss.accept();

        BufferedInputStream bis=new BufferedInputStream(accept.getInputStream());
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("mIdeaTest/ServerDir/copy.txt"));

        int b;
        while ((b= bis.read())!=-1){
            bos.write(b);
        }

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        bos.close();
        accept.close();
        ss.close();
    }
}
