package by.academy.lesson9;

public class Circle extends Shape {
    private int x;
    private int y;

    public Circle() {
        super();
    }


    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }


    @Override
    public void draw() {
        System.out.println(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Circle circle = (Circle) o;
//
//        if (xCenter != circle.xCenter) return false;
//        return yCenter == circle.yCenter;
//    }


}
