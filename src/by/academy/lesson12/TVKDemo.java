package by.academy.lesson12;

import by.academy.DealHW.Cake;
import by.academy.DealHW.Product;
import by.academy.lesson8.Chocolate;

public class TVKDemo {
    public static void main(String[] args) {


        TVK<String, Product, Integer> tvk = new TVK<>("a", new Cake(), 3);
        tvk.printAll();

        tvk.printT();
        tvk.printV();
        tvk.printK();

        System.out.println(tvk.getT());


    }
}
