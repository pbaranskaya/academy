package by.academy.lesson20;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {

        Predicate<String> isNotNull = i -> i != null;
        Predicate<String> isNotEmpty = i -> !i.isEmpty();
        Predicate<String> startsWithJ = i -> i.startsWith("J");
        Predicate<String> startsWithN = i -> i.startsWith("N");
        Predicate<String> endsWithA = i -> i.endsWith("A");

        System.out.println(method("polina", isNotNull) );
        System.out.println(method(null, isNotNull) );
        System.out.println("===========");
        System.out.println(method1("", isNotEmpty) );
        System.out.println(isNotNull.and (isNotEmpty).test("123"));
        System.out.println("===========");
        System.out.println(startsWithJ.or(startsWithN).and(endsWithA).test("J1111A"));
    }

    public static boolean method (String s, Predicate<String> predicate){
        return predicate.test(s);
    }

    public static boolean method1 (String s, Predicate<String> predicate){
        return predicate.test(s);
    }

}
