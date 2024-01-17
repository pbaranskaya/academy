package by.academy.lesson16;

public class Pet {

    String name;

    public Pet (String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
