package by.academy.lesson16;

import by.academy.DealHW.Product;

import java.util.HashMap;

public class PetApp {

    public static void main(String[] args) {

        HashMap<String, Pet> pets = new HashMap<>();

        pets.put("Пушок", new Cat("cat"));
        pets.put("Антон", new Dog("dog"));
        pets.put("Иван", new Parrot("parrot"));

        keys(pets);

    }

    public static void keys(HashMap<String, Pet> h){
        for (String key : h.keySet()) {
            System.out.println(key);
        }
    }
}
