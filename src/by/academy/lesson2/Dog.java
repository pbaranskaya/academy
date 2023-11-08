package by.academy.lesson2;

public class Dog {

    String nickname;
    int age;
    String colour;
    private String name;

    public Dog() {
        super();
    }

    public Dog(String nickname) {
        super();
        this.nickname = nickname;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog(String nickname, int age, String colour) {
        super();
        this.nickname = nickname;
        this.age = age;
        this.colour = colour;
    }



    void eat() {
        System.out.println(nickname + " Ест(" + age + ")");
    }

    void sleep() {
        System.out.println(nickname + " Спит(" + age + ")");
    }

    void serve() {
        System.out.println(nickname + " Служит(" + age + ")");
    }




}
