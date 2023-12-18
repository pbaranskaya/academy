package by.academy.DealHW;

public class Cake extends Product {

    private int tiers;
    private String filling;

    public Cake () {
        super();
    }

    public Cake (String name, double price, double quantity, int tiers, String filling) {
        super(name, price, quantity);
        this.tiers = tiers;
        this.filling = filling;
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

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "tiers=" + tiers +
                ", filling='" + filling + '\'' +
                '}';
    }
}
