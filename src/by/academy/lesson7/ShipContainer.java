package by.academy.lesson7;

public class ShipContainer extends HeavyBox{
    private  String shipnumber;  //можно обращаться к полям др объекта super.toString() наприм - это ссылка на родителя

    public ShipContainer() {
        super();
    }



    public String getShipnumber() {
        return shipnumber;
    }

    public void setShipnumber(String shipnumber) {
        this.shipnumber = shipnumber;
    }

    @Override
    public String toString() {
        return "ShipContainer{" +
                "shipnumber='" + shipnumber + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
