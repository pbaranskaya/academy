package by.academy.lesson5;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("Переменная = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
