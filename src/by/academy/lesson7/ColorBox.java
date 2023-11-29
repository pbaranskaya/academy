package by.academy.lesson7;

public class ColorBox extends Box {

    private String color;


    public ColorBox() {
        super();
    }

    public ColorBox(double height, double width, double depth){
        super(height, width, depth);
    }

    public ColorBox(double height, double width, double depth, String color){
        super(height, width, depth);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorBox{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
