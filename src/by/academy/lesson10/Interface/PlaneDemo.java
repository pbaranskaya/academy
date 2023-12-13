package by.academy.lesson10.Interface;

public class PlaneDemo {

    public static void main(String[] args) {
        Flyable plane = new Plane();
        plane.fly();
        plane.drive();
        plane.test();

        Rocketable rocket = new Plane();
        rocket.fly();
        rocket.rocket();
        rocket.test();

        rocket.turnRight();
        rocket.turnLeft();

        rocket.startEngine();


        Flyable.doSomething();


    }
}
