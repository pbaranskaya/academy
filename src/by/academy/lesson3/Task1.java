package by.academy.lesson3;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.print("Число 1 = ");
        Scanner scanner1 = new Scanner(System.in);
        double input1 = scanner1.nextDouble();
        System.out.print("Число 2 = ");
        Scanner scanner2 = new Scanner(System.in);
        double input2 = scanner2.nextDouble();

        if (input1 > input2) {
            System.out.println("Число 1 больше числа 2");
        } else if (input1 == input2) {
            System.out.println("Число 1 равно числу 1");
        } else {
            System.out.println("Число 2 больше числа 1");
        }

        double srednee = (input1 + input2) / 2;
        System.out.println("Среднее арифметическое = " + srednee);

        System.out.println("=======");

        System.out.println("Задание 2");
        int a = 56;
        System.out.println("Число а = " + a);
        if (a % 2 == 0) {
            System.out.println("Число а четное");
        } else {
            System.out.println("Число нечетное");
        }

        System.out.println("=======");

        System.out.println("Задание 3");
        System.out.print("Число 1 = ");
        Scanner scanner3 = new Scanner(System.in);
        double input3 = scanner3.nextDouble();
        System.out.print("Число 2 = ");
        Scanner scanner4 = new Scanner(System.in);
        double input4 = scanner4.nextDouble();
        System.out.print("Знак = ");
        Scanner scanner5 = new Scanner(System.in);
        String input5 = scanner5.next();
        switch (input5) {
            case "+":
                System.out.println("Результат = " + (input3 + input4));
                break;
            case "-":
                System.out.println("Результат = " + (input3 - input4));
                break;
            case "*":
                System.out.println("Результат = " + (input3 * input4));
                break;
            case "/":
                System.out.println("Результат = " + (input3 / input4));
                break;
        }

        scanner1.close();
        scanner2.close();
        scanner3.close();
        scanner4.close();
        scanner5.close();
    }
}
