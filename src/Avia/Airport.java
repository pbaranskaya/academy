package Avia;

import by.academy.DealHW.Product;

public class Airport {

    private Plane[] planes;
    private int current;

    private void grow() {
        Plane[] newPlanes = new Plane[planes.length * 2 + 1];
        System.arraycopy(planes, 0, newPlanes,0, planes.length);
        planes = newPlanes;
    }

    public void add(Plane plane) {
        if (planes == null) {
            planes = new Plane[10];
            current = 0;
        }
        if (current >= planes.length) {
            grow();
        }
        planes[current++] = plane;
    }

    public int calculateCapacity() {
        if (planes == null) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < current; i++) {
            result += planes[i].getCapacity();
        }
        return result;
    }

    public int calculateLiftingCapacity() {
        if (planes == null) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < current; i++) {
            result += planes[i].getLiftingСapacity();
        }
        return result;
    }

    public Plane[] sortPlanesByCapacity() {

        Plane[] newPlanes = new Plane[planes.length * 2 + 1];
        System.arraycopy(planes, 0, newPlanes,0, planes.length);
        Plane temp = null;
        for (int i = 0; i< current;i++) {
            for (int j = 0; j< current;j++) {

                if(newPlanes[i].getCapacity() <newPlanes[j].getCapacity()){
                    temp = newPlanes[i];
                    newPlanes[i] =newPlanes[j];
                    newPlanes[j] = temp;
                }
            }
        }
       return newPlanes;
    }

    public Plane[] searchByFuelConsumption(int from, int to){
        Plane[] newArray = new Plane[current];
        int index = 0;
        for (int i = 0; i < current; i++) {
            if (planes[i].getFuelConsumption() >= from && planes[i].getFuelConsumption() < to){
                newArray[index++] = planes[i];
            }
        }
        return newArray;
    }


}
