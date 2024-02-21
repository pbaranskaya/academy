package by.academy.HW8;

//
// +? сортировать по весу от большего к меньшему
//
// +? По виду: (используем instance of)
//    Сортировка по видам животных (млекопитающие, птицы, рептилии).
//

import by.academy.HW8.Bird.Bird;
import by.academy.HW8.Bird.HerbivorousBird;
import by.academy.HW8.Mammal.HerbivorousMammal;
import by.academy.HW8.Mammal.Mammal;
import by.academy.HW8.Reptile.Reptile;
import by.academy.HW8.Reptile.Snake;
import by.academy.HW8.Reptile.Turtle;

import static by.academy.HW8.TypeOfFood.GRASS;
import static by.academy.HW8.TypeOfFood.MEAT;

public class Main {

        public static void main(String[] args) {

        WildlifePark wl = new WildlifePark(30);

        Bird bird1 = new HerbivorousBird("Сокол", 2, 2, MEAT);
        Mammal mammal1 = new HerbivorousMammal("Корова", 80,5, GRASS);
        Reptile reptile1 = new Turtle("Черепаха", 30, 1, GRASS);
        Reptile reptile2 = new Snake("Змея", 10, 6, MEAT);

        wl.addAnimal(bird1);
        wl.addAnimal(mammal1);
        wl.addAnimal(reptile1);
        wl.addAnimal(reptile2);

        System.out.println("Добро пожаловать в зоопарк!");
        System.out.println("Зоопарк вмещает " + wl.getCapacity() + " людей");
        System.out.println("Животные зоопарка: ");
        System.out.println(wl);
        System.out.println("Вес всех животных в зоопарке: " + wl.calculateWeight());

        System.out.println("Количество потребления пищи травоядных животных: " + wl.calculateFoodConsumtion(GRASS));
        System.out.println("Количество потребления пищи хищных животных: " + wl.calculateFoodConsumtion(MEAT));

        System.out.println("Количество травоядных животных: " + wl.calculateAnimalsByTypeOfFood(GRASS));
        System.out.println("Количество хищных животных: " + wl.calculateAnimalsByTypeOfFood(MEAT));

        wl.calculateAnimalsByTypeOfAnimal();
        wl.sleep();

        System.out.println("===========");
        wl.sortByWeight();
        System.out.println("===========");
        wl.sortByClass();
        System.out.println("===========");
        System.out.println("Найти животное по типу и количеству потребляемой пищи: ");
        System.out.println(wl.findAnimalsByFoodTypeAndConsumption(MEAT,1,4));
    }
    }