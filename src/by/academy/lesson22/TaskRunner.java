package by.academy.lesson22;

public class TaskRunner {
    public static void main(String[] args) {

        ThreadTask t1 = new ThreadTask("1");
        ThreadTask t2 = new ThreadTask("2");
        ThreadTask t3 = new ThreadTask("3");

        t1.start();
        t2.start();
        t3.start();

    }
}
