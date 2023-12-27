package by.academy.lesson12;

import by.academy.DealHW.Product;

public class Box <T>{

    private T[] items;
    private int current;

    public Box(){
        super();
        this. items = (T[]) new Object[10];
    }

    public Box(T[] items) {
        this.items = items;

    }


    public void add(T item) {
        if(items == null) {
            this.items = (T[]) new Object[10];
        }
        if(items.length <= current){
            grow();
        }
        items[current++] = item;
    }

    public void grow(){
        T[] temp = (T[]) new Object[items.length *2 + 1];
        System.arraycopy(items, 0, temp,0, items.length);
        items = temp;
    }

    public void print (){
        for(int i = 0; i < current; i++){
            System.out.println(items[i]);
        }
    }
    public void set(T[] items) {
        this.items = items;
    }

    public T[] get(){
        return items;
    }



}
