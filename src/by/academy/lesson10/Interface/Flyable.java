package by.academy.lesson10.Interface;

public interface Flyable extends Driveable{
    void fly();
    void test();

    static void doSomething() {
        System.out.println("do some");
    }
}
