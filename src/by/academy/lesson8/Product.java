package by.academy.lesson8;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    protected String name;
    protected double price;
    protected double quantity;

//    public Product() {
//        super();
//    }

    public double calculatePrice() {
        return quantity * price * discount();
    }


    public double discount() {
        if (quantity < 10) {
            return 1;
        } else if (quantity < 20) {
            return 0.8;
        } else {
            return 0.75;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.quantity, quantity) == 0 && Objects.equals(name, product.name);
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
