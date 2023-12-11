package by.academy.lesson7;

public class HeavyBox  extends Box{
    private  double weight;

    public HeavyBox(double height, double width, double depth) {
        super(height, width, depth);
    }

    public HeavyBox(){
        super();
    }

    @Override
    public double  discount() {
        return 1;
    }


    @Override
    public double calcVolume() {
        return width * height * depth - 1;
//        return super.calcVolume() - 1;
    }



}
