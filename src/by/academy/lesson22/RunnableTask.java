package by.academy.lesson22;

import java.util.concurrent.TimeUnit;

public class RunnableTask implements Runnable{

    @Override
    public void run(){
        System.out.println("start thread " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread finished " + Thread.currentThread().getName());
    }
}
