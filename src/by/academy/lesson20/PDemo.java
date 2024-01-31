package by.academy.lesson20;

public class PDemo {
    public static void main(String[] args) {

        Printable p1 = s -> System.out.println("строка: " + s);
        p1.print("test");
    }

}
