package by.academy.lesson7;

public class BoxDemo4 {

    private Box box;


    public static void main(String[] args) {

        Box b = new HeavyBox();
        ColorBox cBox = new ColorBox();
        HeavyBox heavyBox = new HeavyBox();

        printBox(cBox);
    }

    public static void printBox (Box box) {
        System.out.println(box.calcVolume());
        System.out.println(box);
    }

    public static void calcDiscount (Box box) {
//        System.out.println(box.calcVolume());
//        System.out.println(box);
        System.out.println(box.discount() + 1);
    }
}
