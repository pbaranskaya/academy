package by.academy.lesson11;

public interface Coffee {


    public default void buy(){
        System.out.println("Покупка");
    }
}
