package by.academy.lesson7;

public class HeavyBox  extends Box implements Comparable<HeavyBox>{
    private  double weight;
    protected final String number;
//    protected final String number = "3"; // вариант // нельзя далее изменять

    public static final double PI = 3.14;

    public static final String SOME_NAME_OF_MAGIC_CREATURE = "FAIRY";

    @Override
    public int compareTo(HeavyBox h) {
        int hHeight = (int) h.getHeight();
        return (int) (this.height - hHeight);
    }

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

    public static void test(HeavyBox hb) {
        System.out.println("test " + hb);
    }


    @Override
    public double calcVolume() {
        return width * height * depth - 1;
//        return super.calcVolume() - 1; // вариант
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }
}
