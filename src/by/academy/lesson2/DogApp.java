package by.academy.lesson2;

public class DogApp {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
//        dog1.setName("Петр");
//        String dog1Name = dog1.getName();
        dog1.nickname = "Петр";
        dog1.age = 4;
        dog1.colour = "Серый";
        dog1.eat();
        dog1.sleep();
        dog1.serve();
        dog1.setName("Марк");
        System.out.println("Новое имя - " + dog1.getName());


        Dog dog2 = new Dog("Кирилл");
        dog2.age = 5;
        dog2.colour = "Белый";
        dog2.eat();
        dog2.sleep();
        dog2.serve();

        Dog dog3 = new Dog("Василий", 6,"Черный");
        dog3.eat();
        dog3.sleep();
        dog3.serve();


    }
}
