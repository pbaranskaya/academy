package by.academy.lesson10.array;

public class Tomato {

    private String name;
    private Integer quantity;

    public Tomato(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
