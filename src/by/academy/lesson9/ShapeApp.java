package by.academy.lesson9;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("white",6,7);
        shapes[1] = new Rectangle("black", 6,8);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
