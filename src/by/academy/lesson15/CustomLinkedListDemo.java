package by.academy.lesson15;

import java.util.Iterator;

public class CustomLinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        list.remove(2);
        list.print();

        System.out.println("============");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



//        list.print();
//        System.out.println(list.getSize());
//
//        System.out.println("==========");
//        System.out.println(list.get(1));
//        System.out.println(list.get(0));
//        System.out.println(list.get(2));
//        list.get(-1);

//        list.removeTail();
//        list.print();
//        System.out.println("===========");
//        list.removeHead();
//        list.print();



    }
}

