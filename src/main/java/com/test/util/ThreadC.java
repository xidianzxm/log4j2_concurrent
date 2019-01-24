package com.test.util;

import org.apache.logging.log4j.Logger;

public class ThreadC implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("ThreadC");
        Logger logger = LogUtil.getLogger("ThreadC");
        for(int j=0;j< 1000; j++){
            logger.info(Thread.currentThread().getName()+"_"+j);
//                logger.info("Testing testing testing 111");
//                logger.debug("Testing testing testing 222");
//                logger.error("Testing testing testing 333");
        }

    }
}
