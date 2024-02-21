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
    }

    public int calculateFoodConsumtion(TypeOfFood typeOfFood) {
        if (animals == null) {
            return 0;
        }
        int result = 0;
        return animals.stream().filter(s -> s.getTypeOfFood() == typeOfFood).mapToInt(Animal::getAmountOfFoodPerDay).sum();
    }

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


    public Predicate<Animal> getTypePredicate(String type){
        if(type == null) {
            throw new UnsupportedOperationException();
        }
        switch (type){
            case "Mammal": return a-> a instanceof Mammal;
            case "Reptile": return a-> a instanceof Reptile;
            case "Bird": return a-> a instanceof Bird;
        }
        return  a-> false;
    }

    public long calculateAnimalsByTypeOfAnimal(String type) {
        if (animals == null) {
            return 0;
        }
        return animals.stream().filter(getTypePredicate(type)).count();
    }


    public void sleep() {
        animals.forEach(Animal::sleep);
    }


    public List<Animal> sortByWeight() {
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
}
