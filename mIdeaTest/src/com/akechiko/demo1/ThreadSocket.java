package com.akechiko.demo1;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable {
    private Socket acceptSocket;

    public ThreadSocket(Socket accept) {
        this.acceptSocket=accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos=null;
        try {
            BufferedInputStream bis=new BufferedInputStream(acceptSocket.getInputStream());
            bos=new BufferedOutputStream(new FileOutputStream("mIdeaTest/ServerDir/"+ UUID.randomUUID().toString()+".txt"));

            int b;
            while ((b= bis.read())!=-1){
                bos.write(b);
            }

            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(acceptSocket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bos!=null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (acceptSocket!=null) {
                try {
                    acceptSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
