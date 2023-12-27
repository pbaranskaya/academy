package by.academy.lesson12;

import by.academy.DealHW.Product;

import java.io.Serializable;

public class TVK <T extends Comparable <String>, V extends Product & Serializable, K extends Number>{

    private T t;
    private V v;
    private K k;

    public TVK(T t, V v, K k){
        super();
        this.t = t;
        this.v = v;
        this.k = k;
    }

//    public TVK(String a, Cat cat, int i) {
//    }

    public  T getT(){
        return t;
    }

    public V getV(){
        return v;
    }

    public K getK(){
        return k;
    }

    public void printT() {
        System.out.println(t.getClass().toString());
    }

    public void printV() {
        System.out.println(v.getClass().toString());
    }

    public void printK() {
        System.out.println(k.getClass().toString());
    }

    public void printAll() {
        System.out.println(t.getClass().toString() + " " + v.getClass().toString() + " " + v.getClass().toString());
    }



}
