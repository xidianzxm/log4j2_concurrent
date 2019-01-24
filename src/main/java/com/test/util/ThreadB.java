package com.test.util;

import org.apache.logging.log4j.Logger;

public class ThreadB implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("ThreadB");
        ThreadC c = new ThreadC();
        Thread t3 = new Thread(c);
        t3.start();

        Logger logger = LogUtil.getLogger("ThreadB");
        for(int j=0;j< 1000; j++){
            logger.info(Thread.currentThread().getName()+"_"+j);
//                logger.info("Testing testing testing 111");
//                logger.debug("Testing testing testing 222");
//                logger.error("Testing testing testing 333");
        }

    }
}
