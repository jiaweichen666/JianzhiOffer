package ConcurrentDemo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static long timeTasks(int threadNum,final Runnable task) throws InterruptedException{
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate  = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            Thread t = new Thread(){
                public void run(){
                    try{
                        startGate.await();
                        try{
                            task.run();
                        }finally {
                            endGate.countDown();
                        }
                    }catch (InterruptedException ignored){ }
                }
            };
            t.start();

        }
        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        };
        System.out.println(timeTasks(10,runnable));
    }
}
