package by.academy.lesson22;

public class ThreadDemo {
    private static int i = 1;

    public static void main(String[] args) {

        Thread t1 = new Thread(getRunnableTask());
        Thread t2 = new Thread(getRunnableTask());
        Thread t3 = new Thread(getRunnableTask());

        t1.start();
        t2.start();
        t3.start();
        System.out.println("main finished, i = " + i);
    }

    private static Runnable getRunnableTask() {
        return new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000; j++) {
                    i++;
                }
                System.out.println(i);
            }
        };
    }
}


