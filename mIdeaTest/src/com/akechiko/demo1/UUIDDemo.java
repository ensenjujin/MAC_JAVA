package com.akechiko.demo1;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        LOGGER.debug("debug级别日志");
        LOGGER.info("info级别日志");
        LOGGER.warn("warn级别日志");
        LOGGER.error("error级别日志");
    }

    //private static final Logger LOGGER =Logger.getLogger(UUIDDemo.class);
    private static final Logger LOGGER= LoggerFactory.getLogger(UUIDDemo.class);

    public void sum(){
        int a=11;
        int b=22;
        System.out.println(a+b);
    }
}
