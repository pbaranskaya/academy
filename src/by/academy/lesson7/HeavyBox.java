package by.academy.lesson7;

public class HeavyBox  extends Box{
    private  double weight;
    protected final String number;
//    protected final String number = "3"; // вариант // нельзя далее изменять

    public static final double PI = 3.14;

    public static final String SOME_NAME_OF_MAGIC_CREATURE = "FAIRY";

    public HeavyBox(double height, double width, double depth) {
        super(height, width, depth);
        this.number = "2";
    }

    public HeavyBox(){
        super();
        this.number = "1";
    }



    @Override
    public final double discount() {
        return 1;
    }


    @Override
    public double calcVolume() {
        return width * height * depth - 1;
//        return super.calcVolume() - 1; // вариант
    }



}
