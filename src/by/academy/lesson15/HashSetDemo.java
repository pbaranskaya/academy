package by.academy.lesson15;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<BadCat> set = new HashSet<>();
//        set.add("Минск");
//        set.add("Витебск");
//        set.add("Гродно");
//
//        for (String s : set) {
//            System.out.println(s);
//        }

        System.out.println(set.hashCode());

        set.add(new BadCat("v", 5));
        set.add(new BadCat("b", 3));

        for (BadCat s : set) {
            System.out.println(s);
        }

    }
}
