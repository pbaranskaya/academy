package by.academy.Strings;

// Ввести n строк с консоли, найти самую короткую и самую длинную строки.
// Вывести найденные строки и их длину.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.print("n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Строка: ");
            str[i] = sc.nextLine();
        }
    }
}
