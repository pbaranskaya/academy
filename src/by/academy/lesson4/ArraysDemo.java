package by.academy.lesson4;

public class ArraysDemo {
    public static void main(String[] args) {
//        int[] ints = new int[10];
//        ints[4] = 100;
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
//        System.out.println(Arrays.toString(ints));

        String[] strings = new String[7];
        strings[0] = "Понедельник";
        strings[1] = "Вторник";
        strings[2] = "Среда";
        strings[3] = "Четверг";
        strings[4] = "Пятница";
        strings[5] = "Суббота";
        strings[6] = "Воскресенье";
        for (int i = 0; i < strings.length; i++) {
        }
        System.out.println(strings[strings.length-1]);

        double[] doubles = {1.1,2.2,3.3,4.4};
        for (int i = 0; i < strings.length; i++) {
        }
        System.out.println(doubles[0]);
    }
}
