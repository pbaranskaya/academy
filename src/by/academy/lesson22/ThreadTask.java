package by.academy.lesson22;

import java.util.concurrent.TimeUnit;

public class ThreadTask extends Thread{
    private int i = 10;
    public ThreadTask(String name){
        super(name);
    }

    @Override
    public void run(){
        Thread t = new Thread(() -> System.out.println(Thread.currentThread().getPriority()));
        t.setPriority(1);
        t.start();
    }

//    @Override
//    public void run(){
//        while (!Thread.currentThread().isInterrupted()){
//            System.out.println("thread " + Thread.currentThread().getName() + " incremented value " + i);
//            i++;
//            try {
//                TimeUnit.SECONDS.sleep(5);
////                sleep(5000);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//                System.out.println("!!");
//                throw new RuntimeException(e);
//            }
//            Thread t = new Thread(() -> System.out.println(Thread.currentThread().getPriority()));
//        }
//    }
}
