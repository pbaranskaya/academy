package by.academy.Avia;

import java.util.Arrays;

public class AirportApp {


    public static void main(String[] args) {

        Airport a1 = new Airport();

        Plane p1 = new WarPlane("WarPlane1", 4, 6,1);
        Plane p2 = new WarPlane("WarPlane2", 6, 7,2);
        Plane p3 = new PassengersPlane("PassengersPlane1", 8,9,3);
        Plane p4 = new PassengersPlane("PassengersPlane3", 7,13,4);

        a1.add(p1);
        a1.add(p2);
        a1.add(p3);
        a1.add(p4);

        System.out.println("Вместимость: " + a1.calculateCapacity());
        System.out.println("Грузоподъемность: " + a1.calculateLiftingCapacity());

        System.out.println(Arrays.toString(a1.sortPlanesByCapacity()));

        System.out.println(Arrays.toString(a1.searchByFuelConsumption(2,3)));

    }

}
