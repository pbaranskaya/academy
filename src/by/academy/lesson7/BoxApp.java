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
    }
}
