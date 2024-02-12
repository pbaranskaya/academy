package by.academy.lesson22;

public class Priority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("=======");
        ThreadTask t = new ThreadTask("1");
        t.setPriority(10); // 1-10 можно 10 - больший приоритет 1 - меньший
        System.out.println(t.getPriority());
        t.start();
    }
}
