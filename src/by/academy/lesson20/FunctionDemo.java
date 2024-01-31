package by.academy.lesson20;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<Integer, String> function = i -> {
            return i > 0 ? "полож" : i < 0 ? "отриц" : "ноль";
        };

        Function<Integer, String> function1 = i -> i > 0 ? "полож" : i < 0 ? "отриц" : "ноль";

        System.out.println(function.apply(-1));
        System.out.println(function1.apply(0));
        System.out.println(function1.apply(4));
    }
}
