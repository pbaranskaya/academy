package by.academy.lesson7;

public class WrappersDemo {
    public static void main(String[] args) {

        int i = 5;
        Integer iW = 5;

        Integer iwc = new Integer(5); //устаревший конструктор

        Integer iwm =Integer.valueOf(5);

        Integer iws = Integer.valueOf("5");

        System.out.println(iW);
        System.out.println(Integer.toOctalString(iW));
        System.out.println(Integer.toHexString(iW));
        System.out.println(Integer.toBinaryString(iW));


        double d1 = 0.0;
        double d2 = 0.0;
        System.out.println(d1 / d2);

        int prim = 100;
        int prim2 = convert(100);
        System.out.println(prim2);

    }


    public static int convert(Integer i) {
        System.out.println(i);
        System.out.println(i.getClass());
        return i;
    }


}
