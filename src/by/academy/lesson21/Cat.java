package by.academy.lesson21;

public class Cat {

    public String name;
    private int age;
    protected String color;

    public Cat (String name, int age, String color){
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private void grow(){
        System.out.println("grows");
    }

    protected void sleep(){
        System.out.println("sleeps"); //
    }
}
