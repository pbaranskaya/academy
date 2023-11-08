package by.academy.lesson3;

public class IfElseDemo {
    public static void main(String[] args) {

        int deg = 50;

        if(deg > 35) {
            System.out.println("Нужно включить кондиционер");
        } else if(deg > 25) {
            System.out.println("Нужно работать");
        } else if(deg > 15) {
            System.out.println("В баню");
        } else if(deg > 0) {
            System.out.println("Пора менять резину");
        } else if(deg > -15) {
            System.out.println("Достаем санки");
        } else {
            System.out.println("Сидим дома");
        }

    }
}
