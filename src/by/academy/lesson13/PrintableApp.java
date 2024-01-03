package by.academy.lesson13;

public class PrintableApp {
    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Печать");
            }
        };
        printable.print();
    }
}
