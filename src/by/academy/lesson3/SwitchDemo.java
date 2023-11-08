package by.academy.lesson3;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        System.out.print("Месяц = ");
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        switch (month) {
            case "Январь":
                System.out.println("Номер месяца = 1");
                break;
            case "Февраль":
                System.out.println("Номер месяца = 2");
                break;
            case "Март":
                System.out.println("Номер месяца = 3");
                break;
            case "Апрель":
                System.out.println("Номер месяца = 4");
                break;
            case "Май":
                System.out.println("Номер месяца = 5");
                break;
            case "Июнь":
                System.out.println("Номер месяца = 6");
                break;
        }
        sc.close();
    }
}
