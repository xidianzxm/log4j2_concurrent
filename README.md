# log4j2_concurrent
log4j2动态生成logger，支持多线程 
```
public class ThreadA implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setName("ThreadA");
        Logger logger = LogUtil.getLogger("ThreadA");
        for(int j=0;j< 1000; j++){
            logger.info(Thread.currentThread().getName()+"-"+j);
            //logger.info("Testing testing testing 111");
            //logger.debug("Testing testing testing 222");
            //logger.error("Testing testing testing 333");
        }
    }
}
```
