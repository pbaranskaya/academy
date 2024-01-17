package by.academy.lesson16;

// 8.	Создайте HashMap, содержащий пары значений  - имя продукта и объект продукта (класс Product).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.

import by.academy.DealHW.Berry;
import by.academy.DealHW.Product;


import java.util.HashMap;

public class HashMapProduct {

    public static void main(String[] args) {

        HashMap<String, Product> products = new HashMap<>();

        products.put("Черника", new Berry());
        products.put("Клубника", new Berry());

        for (String key : products.keySet() ) {
            System.out.println(key);
        }

        for (Product value : products.values()) {
            System.out.println(value);
        }

    }
}
