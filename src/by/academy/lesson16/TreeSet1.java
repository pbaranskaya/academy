package by.academy.lesson16;

// Создать TreeSet содержащий HeavyBox. HeavyBox должен реализовать интерфейс Comparable.
// Распечатать содержимое с помощью for each.

import by.academy.lesson7.HeavyBox;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        TreeSet<HeavyBox> ts = new TreeSet<>(new Comparator<HeavyBox>() {
            @Override
            public int compare(HeavyBox o1, HeavyBox o2) {
                int hWidth = (int) o2.getWidth();
                return (int) (o1.getWidth() - hWidth);
            }
        });

        HeavyBox h1 = new HeavyBox(2, 4, 6);
        HeavyBox h2 = new HeavyBox(5, 5, 7);
        HeavyBox h3 = new HeavyBox(7, 6, 6);

        ts.add(h1);
        ts.add(h2);
        ts.add(h3);

        for (HeavyBox h : ts) {
            System.out.println(h);
        }
    }
}