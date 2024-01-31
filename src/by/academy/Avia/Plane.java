package by.academy.Avia;

public abstract class Plane {

    protected String name;

    protected int capacity; // вместимость

    protected int liftingСapacity; // грузоподъемность

    protected int fuelConsumption;

    public Plane() {
        super();
    }

    public Plane (String name, int capacity, int liftingСapacity, int fuelConsumption) {
        super();
        this.name = name;
        this.capacity = capacity;
        this.liftingСapacity = liftingСapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLiftingСapacity() {
        return liftingСapacity;
    }

    public void setLiftingСapacity(int liftingСapacity) {
        this.liftingСapacity = liftingСapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", liftingСapacity=" + liftingСapacity +
                '}';
    }
}
