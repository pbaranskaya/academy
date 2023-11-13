package by.academy.lesson2;

public class DogAndSchool {
    public static void main(String[] args) {

        Dog d = new Dog("Шарик",1000);
//        while(d.getAge() < 7) {
//            d.grow();
//        }
//        System.out.println(d.getNickname() + " пора идти в школу");
        do {
           d.grow();
        } while (d.getAge() < 7);
        System.out.println(d.getNickname() + " пора идти в школу " + d.getAge() + " лет");
    }
}
