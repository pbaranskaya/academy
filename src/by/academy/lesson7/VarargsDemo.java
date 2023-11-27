package by.academy.lesson7;

public class VarargsDemo {

    public static void test(int i) {
        System.out.println(i);
    }

    public static void test(int i1, int i2) {
        System.out.println("two param");

        System.out.println(i1);
        System.out.println(i2);
    }

    public static void test(int...vars) { // vars всегда в конце
        System.out.println("VAR ARGS param");

        for (int i : vars) {
            System.out.println(i);
        }
    }





    public static void main(String[] args) {
        test(9);
        test(9,2);
        test(9,6,2,1);
        test(4,7,3,2,5,7);

    }
}
