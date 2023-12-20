package by.academy.lesson11;

public class CoffeeSizeDemo {
    public static void main(String[] args) {

        CoffeeSize coffeeSize = CoffeeSize.BIG;

        String string = "HUGE";
        CoffeeSize coffeeSize1 = CoffeeSize.valueOf(string);
        System.out.println(coffeeSize1);


        System.out.println(coffeeSize1.name());
        System.out.println(coffeeSize1.ordinal()); // номер в массиве

        coffeeSize.buy();
        coffeeSize1.buy();



        switch (coffeeSize) {
            case BIG:
                System.out.println("BIG" + coffeeSize1.ml);
                break;
            case HUGE:
                System.out.println("HUGE");
                break;
            case OVERWELMING:
                System.out.println("OVERWELMING");
                break;
            default:
                System.out.println("Неизвестный кофе");
        }

        System.out.println();

        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size);
        }

        CoffeeSize.values(); // массив всех значений

    }
}
