package by.academy.lesson19;

import java.io.*;

public class CarSerializer {
    public static void main(String[] args) throws IOException {

        Car c1 = new Car();
        c1.setModel("Volga");
        c1.setOwner("Elon");
        c1.setPrice(10);

        Car c2 = new Car();
        c2.setModel("Volga123");
        c2.setOwner("Elona");
        c2.setPrice(103);

        File f = new File("src/io/cars.txt");

        if(!f.exists()) {
            f.createNewFile();
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){

            oos.writeObject(c1);
            oos.writeObject(c2);

        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
