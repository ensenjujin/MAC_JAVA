package com.akechiko.demo1;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        UUID uuid=UUID.randomUUID();
        String s=uuid.toString().replace("-","");
        System.out.println(s);
    }
}
