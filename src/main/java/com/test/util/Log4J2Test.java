package com.test.util;

import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Log4J2Test {
//    static {
//        System.setProperty("Log4jContextSelector",
//                "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
//    }
    public static void main(String[] args) throws IOException, InterruptedException {

        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
