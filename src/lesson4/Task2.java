package lesson4;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

//        for (int i = 10; i <= 20; i++) {
//            System.out.println(i * i);
//        }
//
//
//        System.out.println("=====");
//
//        int sum = 0;
//        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i < n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        System.out.println("=====");

        int res = 1;
        System.out.print("n = ");
        int n1 = sc.nextInt();
        for (int i = 1; i < n1; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
