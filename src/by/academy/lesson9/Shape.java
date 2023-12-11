package by.academy.lesson9;

public abstract class Shape {

    String color;

    public Shape() {
        super();
    }

    public abstract int draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
