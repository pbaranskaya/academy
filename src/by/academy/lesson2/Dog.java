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

    public void setNickame(String Nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public Dog(String nickname, int age, String colour) {
        super();
        this.nickname = nickname;
        this.age = age;
        this.colour = colour;
    }

    public Dog(String nickname, int age) {
        super();
        this.nickname = nickname;
        this.age = age;
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

    public void grow() {
        this.age++;
        System.out.println("Happy birthday " + age);
    }
}
