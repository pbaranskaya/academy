package by.academy.lesson14;

import by.academy.lesson7.HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListTest {
    public static void main(String[] args) {


        ArrayList<HeavyBox> boxes= new ArrayList<>();

        HeavyBox b1 = new HeavyBox(1,2,3);
        HeavyBox b2 = new HeavyBox(3,2,3);

        boxes.add(b1);
        boxes.add(b2);

        for(Object s : boxes) {
            System.out.println(s);
        }

        HeavyBox b3 = boxes.get(0);
        b3.setDepth(b3.getDepth() + 1);

        boxes.remove(boxes.size() - 1);

        boxes.clear();

        Object[] array = boxes.toArray();
        System.out.println(Arrays.toString(array));


    }
}
