package by.academy.lesson10.array;

public class TomatoDemo {
    public static void main(String[] args) {

        Container c = new Container();
        c.add(new Tomato("Heart", 3));
        c.add(new Tomato("d", 7));
        c.add(new Tomato("t", 8));
        c.add(new Tomato("h", 3));

        c.printTomatos();

        c.delete(-1);
        c.delete(0);
        c.printTomatos();




    }







}
