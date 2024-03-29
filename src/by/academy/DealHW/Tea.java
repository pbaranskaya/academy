package by.academy.DealHW;

@Producer(startYear = 2022, country = "РФ", founderFullName = "b")

public class Tea extends Product {

    private String temperature;
    private String type;

    public Tea () {
        super();
    }

    public Tea (String name, double price, double quantity, String temperature, String type) {
        super(name, price, quantity);
        this.temperature = temperature;
        this.type = type;
    }

    @Override
    public double discount() {
        if (quantity < 10) {
            return 1;
        } else if (quantity < 20) {
            return 0.8;
        } else {
            return 0.75;
        }
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "temperature='" + temperature + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}