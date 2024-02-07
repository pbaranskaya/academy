package by.academy.lesson21;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task1 {
    public static void main(String[] args) {

        Cat c = new Cat ("cat",2,"blue");
        Tiger t = new Tiger ("tiger",2,"red", "kind", 34,"blue");

        Class<Cat> catClass = Cat.class;
        Class<Tiger> tigerClass = Tiger.class; //clazz название переменной часто используемое

        try {
            Field nameField = catClass.getDeclaredField("name");
            Field ageField = catClass.getDeclaredField("age");
            Field colorField = catClass.getDeclaredField("color");
            ageField.setAccessible(true);
            colorField.setAccessible(true);
            System.out.println(nameField.get(c));
            System.out.println(ageField.get(c));
            System.out.println(colorField.get(c));
            nameField.set(c, "kitten");
            System.out.println(nameField.get(c));

            Field characterField = tigerClass.getDeclaredField("character");
            Field linesField = tigerClass.getDeclaredField("lines");
            Field eyesColorField = tigerClass.getDeclaredField("eyesColor");
            linesField.setAccessible(true);
            eyesColorField.setAccessible(true);
            System.out.println(characterField.get(t));
            System.out.println(linesField.get(t));
            System.out.println(eyesColorField.get(t));
            characterField.set(t, "evil");
            System.out.println(characterField.get(t));

            Method runMethod = tigerClass.getDeclaredMethod("run");
            runMethod.setAccessible(true);
            runMethod.invoke(t);

        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
