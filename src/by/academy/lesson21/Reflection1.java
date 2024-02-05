package by.academy.lesson21;

import java.lang.reflect.Field;

public class Reflection1 {
    public static void main(String[] args) {

        Class<Car> carClass = Car.class;// предпочтительный

        System.out.println("ex 1");
        Field [] fields = carClass.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }



    }
}
