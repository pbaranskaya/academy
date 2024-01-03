package by.academy.lesson13;

public class MinMax <T extends Number> {

    private T[] array;


    public MinMax(T[] array) {
        this.array = array;
    }

    public double Min1() {
        double min = Double.MAX_VALUE;
        for(T num : array) {
            if (num == null) {
                continue;
            }
            if (num.doubleValue() < min) {
                min = num.doubleValue();
            }
        }
        return min;
    }

    public double min() {
        double min = Double.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
                if (array[i].doubleValue() < min) {
                    min = array[i].doubleValue();
                }
            }
        return min;
    }

    public double Max() {
        double max = 0;

        return max;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 6, 7, 4 ,2};
        MinMax <Integer> MinMax = new MinMax<>(array);

        System.out.println(MinMax.Min1()); // МЕТОД С МАЛ БУКВЫ
        System.out.println(MinMax.min());

    }
}

