package by.academy.lesson10.Interface;

public class Plane implements Rocketable, Driveable{

    @Override
    public void fly() {
        System.out.println("i can fly");
    }
    public void test() {
        System.out.println("i can test");
    }
    public void drive() {
        System.out.println("i can drive");
    }

    @Override
    public void startEngine() {
        Rocketable.super.startEngine();
//        Driveable.super.startEngine();
    }

    private void privateFunctionality() {
        System.out.println();
    }

    public void rocket() {
        System.out.println("i can rocket");
    }


}
