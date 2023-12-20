package by.academy.lesson11;

import by.academy.DealHW.User;

public class DebugDemo {
    public static void main(String[] args) {

        User u = new User("Иван");
        Integer i = 0;

        i++;
        i = 5 + ++i;
        i += 10;
        System.out.println(i);
    }
}
