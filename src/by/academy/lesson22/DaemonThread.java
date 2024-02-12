package by.academy.lesson22;

import java.util.concurrent.TimeUnit;

public class DaemonThread {
    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(getRunnableTask());
        t.setDaemon(true);
        t.start();
//        Thread.currentThread().join();
        System.out.println("main tread finished");
    }

    private static Runnable getRunnableTask() {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(100); //не ждали завершения т.к. daemon поток
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                for (int j = 0; j < 1000; j++) {
                    i++;
                }
                System.out.println("additional thread finished" + i);
            }
        };
    }
}
