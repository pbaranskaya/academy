package by.academy.lesson7;

public class BoxApp {
    public static void main(String[] args) {
        Box myBox = new Box();
// присвоить значение переменным экземпляра mybox
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
// рассчитать объем параллелепипеда
        double volume = myBox.calcVolume();
        System.out.println("Объем равен " + volume);

        System.out.println("ColorBox");
        ColorBox cb1 = new ColorBox(20, 40, 68, "Red");
        System.out.println(cb1.toString());

        ColorBox box0 = new ColorBox();
        box0.setHeight(1);

        Box box1 = new ColorBox(); // как создать вариант// нельзя задать цвет, т.к. создали при помощи Box


        Box box3 = new ShipContainer(); // матрешка
        System.out.println(box3);


    }



}
