package by.academy.HW8;

import by.academy.HW8.Bird.Bird;
import by.academy.HW8.Mammal.Mammal;
import by.academy.HW8.Reptile.Reptile;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static by.academy.HW8.TypeOfFood.GRASS;
import static by.academy.HW8.TypeOfFood.MEAT;

public class WildlifePark {

    private final List<Animal> animals = new ArrayList<>();

    private final Map<String, Class<? extends Animal>> mapTypes = new HashMap<>();
    private int capacity;

    public WildlifePark(int capacity) {
        super();
        this.capacity = capacity;
    }

    public void addAnimal(Animal animal) {
        if(animal == null){
            return;
        }
        animals.add(animal);
        Class<? extends  Animal> animalClass = animal.getClass();
        if (!mapTypes.containsKey(animalClass.getSimpleName())){
            mapTypes.put(animalClass.getSimpleName(), animalClass);
        }
    }

//    public int calculateFoodConsumtion(TypeOfFood typeOfFood) {
//        if (animals == null) {
//            return 0;
//        }
//        int result = 0;
//        return animals.stream().filter(s -> s.getTypeOfFood() == typeOfFood).mapToInt(Animal::getAmountOfFoodPerDay).sum();
//    }

    public int calculateAnimalsByTypeOfFood(TypeOfFood typeOfFood) {
        if (animals == null) {
            return 0;
        }
        int result = 0;
        if (typeOfFood == GRASS) {
            List<Animal> newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == GRASS).collect(Collectors.toList());
            result = newAnimals.size();
        }
        if (typeOfFood == MEAT) {
            List<Animal> newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == MEAT).collect(Collectors.toList());
            result = newAnimals.size();
        }
        return result;
    }


    public boolean getTypePredicate(Animal animal, String type){
        if(!mapTypes.containsKey(type)) {
            throw new UnsupportedOperationException();
        }
        Class<? extends Animal> clazz = mapTypes.get(type);
        return animal instanceof clazz.;
    }

    public long calculateAnimalsByTypeOfAnimal(String type) {
        if (animals == null) {
            return 0;
        }

//        int result = 0;

        return animals.stream().filter(animal -> getTypePredicate(animal, type)).count();
//        result = birdAnimals.size();
//        System.out.println("Количество животных типа Bird: " + result);
//
//        List<Animal> mammalAnimals = animals.stream().filter(s -> s instanceof Mammal).collect(Collectors.toList());
//        result = mammalAnimals.size();
//        System.out.println("Количество млекопитающих типа Mammal: " + result);
//
//        List<Animal> retileAnimals = animals.stream().filter(s -> s instanceof Reptile).collect(Collectors.toList());
//        result = retileAnimals.size();
//        System.out.println("Количество животных типа Reptile: " + result);
    }


    public void sleep() {
        animals.forEach(element -> element.sleep());
    }

    public int calculateFoodConsumtion(TypeOfFood typeOfFood) {
        if (animals == null) {
            return 0;
        }
        int result = 0;
        return animals.stream().filter(s -> s.getTypeOfFood() == typeOfFood).mapToInt(Animal::getAmountOfFoodPerDay).sum();
    }

    public List<Animal> sortByWeight() { //нов
        return animals.stream().sorted(Comparator.comparingInt(Animal::getWeight).reversed()).collect(Collectors.toList());
    }

    public List<Animal> sortByClass(Predicate<Animal> predicate){
        return animals.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<Animal> findAnimalsByFoodTypeAndConsumption(TypeOfFood typeOfFood, int minAmountOfFood, int maxAmountOfFood){
        List<Animal> newAnimals = new ArrayList<>();
        if (typeOfFood == GRASS) {
            newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == GRASS)
                    .filter(s -> s.getAmountOfFoodPerDay() >= minAmountOfFood
                            && s.getAmountOfFoodPerDay() <= maxAmountOfFood).collect(Collectors.toList());
        }
        if (typeOfFood == MEAT) {
            newAnimals = animals.stream().filter(s -> s.getTypeOfFood() == MEAT).
                    filter(s -> s.getAmountOfFoodPerDay() >= minAmountOfFood
                            && s.getAmountOfFoodPerDay() <= maxAmountOfFood).collect(Collectors.toList());

        }
        return newAnimals;
    }

    public int calculateWeight() {
        if (animals == null) {
            return 0;
        }
        return animals.stream().mapToInt(Animal::getWeight).sum();
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "WildlifePark{" +
                "animals=" + animals +
                '}';
    }

    //    public static List<Animal> sortByType(TypeOfFood type){
//        return animals.stream().sorted(TypeOfFood type).collect(Collectors.toList());
//    }
//
//    private static Comparator<? extends Animal> mComparator = (a1, a2) -> a1 {
//
//    };
//
//    public static Comparator<? super Animal> getTypeComparator(TypeOfFood type){
//        if (type == null){
//            return null;
//        }
//        switch (type) {
//            case "Mammal":
//                return
//        }
//    }
}
