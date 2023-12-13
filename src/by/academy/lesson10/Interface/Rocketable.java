package by.academy.lesson10.Interface;

public interface Rocketable extends Flyable{

    void rocket();

    default void startEngine() { // с реализацией обязательно
        System.out.println("Rocketable vehicle launched");
    }
}
