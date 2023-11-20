package by.academy.lesson6;

public class BlankDemo {
    public static void main(String[] args) {

        String a = "some thing";
        boolean isEmpty = a.isEmpty();
        System.out.println("is Empty: " + isEmpty);
        boolean isBlank = a.isBlank();
        System.out.println("is Blank: " + isBlank);
    }
}
