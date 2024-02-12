package by.academy.lesson22;

public class RunnableTaskRunner {
    public static void main(String[] args) {

        Thread t1 = new Thread(new RunnableTask(),"1");
        Thread t2 = new Thread(new RunnableTask(),"2");
        Thread t3 = new Thread(new RunnableTask(),"3");

        Thread t4 = new Thread(() -> System.out.println("print something")); //как вариант

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
