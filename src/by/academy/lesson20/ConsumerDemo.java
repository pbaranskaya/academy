package by.academy.lesson20;

import by.academy.lesson7.HeavyBox;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer <HeavyBox> c2 = b -> System.out.println("отгрузили ящик с весом" + b.getWeight());
        Consumer<HeavyBox> с1 = b -> System.out.println("отгрузили ящик с весом" + b.getWeight());;
        с1.andThen(c2).accept(new HeavyBox(1, 2, 3));

    }
}

