package by.academy.DealHW;

import java.io.Serializable;
import java.util.Objects;

public abstract class Product implements Serializable {

    protected String name;
    protected double price;
    protected double quantity;


    public Product() {
        super();
    }

    public Product(String name, double price, double quantity) {
        super();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculatePrice() {
        return quantity * price * discount();
    }

    public abstract double discount();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Double.compare(quantity, product.quantity) == 0
                && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}