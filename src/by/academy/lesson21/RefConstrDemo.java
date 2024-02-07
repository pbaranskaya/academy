package by.academy.lesson21;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefConstrDemo {
    public static void main(String[] args) {

        try {

            Class<Cat> catClass = Cat.class;
            Constructor<Cat> c = catClass.getConstructor();

            Cat c1 = c.newInstance("cat", 2, "red");
            System.out.println(c1);

        } catch (NoSuchMethodException | SecurityException | InvocationTargetException |
                 InstantiationException | IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
