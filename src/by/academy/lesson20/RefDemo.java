package by.academy.lesson20;

import by.academy.lesson7.HeavyBox;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class RefDemo {
    public static void main(String[] args) {

        System.out.println(Math.abs(-6.5));
        Consumer<Double> abs = d -> System.out.println(Math.abs(d));
        abs.accept(-1000d);
        UnaryOperator<Double> absU = d -> Math.abs(d);
        System.out.println(absU.apply(-1000d));

        UnaryOperator<Double> absRef = Math::abs;
        System.out.println(absRef.apply(-1000d));

        HeavyBox hb = new HeavyBox(1,2,3);
        Consumer<HeavyBox> hBU = b -> {
            b.setDepth(1000);
        };
        hBU.accept(hb);
        System.out.println(hb);

        System.out.println("=========");

//        Consumer<HeavyBox> hbRef = hb::test;
//        hbRef.accept(hb);

        Consumer<HeavyBox> hbRef1 = HeavyBox::test;
        hbRef1.accept(hb);

        Function<String, Integer> f = Integer::new;
        System.out.println(f.apply("4"));

        Function<Integer, List<String>> f1 = ArrayList::new;
    }
}
