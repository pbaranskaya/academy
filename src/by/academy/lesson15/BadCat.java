package by.academy.lesson15;

public class BadCat {
    private String name;
    private int age;

    public BadCat(String name, int age){
        super();
        this.age = age;
        this.name = name;
    }

//    @Override
//    public int hashCode(){
//        return 1;
//    }

    @Override
    public boolean equals(Object obj){
        return false;
    }

    @Override
    public String toString() {
        return "BadCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


