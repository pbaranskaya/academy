package by.academy.lesson10.Interface;

public interface Driveable {
    void drive();
    void test();

    default void startEngine() {
        System.out.println("Drivable vehicle launched");
    }

    default void turnLeft() {
        System.out.println("turn left");
    }
    default void turnRight() {
        System.out.println("turn right");
    }


}
