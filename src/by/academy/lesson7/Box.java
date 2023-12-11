package by.academy.lesson7;

public abstract class Box {

    double width;
    double height;
    double depth;

    public void setHeight(String height) {
        this.height = Double.valueOf(height);
    }

    public void setHeight(Integer height) {
        this.height = (double) height; // не рекомендуется
    }

    public void setHeight(Double height) { // может быть несколько параметров
        this.height = height;
    }


    public Box() {
        super();
    }

    public abstract double discount();


    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void setDim(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(double height, double width, double depth, String name) {
        this(height, width, depth); // ссылаемся на созданный конструктор, можно на метод через точку
        System.out.println(name);
    }




    public double calcVolume() {
        return width * height * depth * 4;
    }


    public void someMethod () {
        super.toString();
        calcVolume();
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
