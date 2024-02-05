package by.academy.lesson21;

public class Tiger extends Cat{

    public String character;
    private int lines;
    protected String eyesColor;

    public Tiger(String name, int age, String color) {
        super(name, age, color);
    }

    public Tiger(String name, int age, String color, String character, int lines, String eyesColor) {
        super(name, age, color);
        this.character = character;
        this.lines = lines;
        this.eyesColor = eyesColor;
    }

    private void run(){
        System.out.println("Tiger runs");
    }
}
