package by.academy.lesson19;

import java.io.*;

public class UserDeSerializerDemo {
    public static void main(String[] args) throws IOException {

        File users = new File("src/io/users.txt");
        if (!users.exists()) {
            users.createNewFile();
        }

        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(users))) {

            Integer i = (Integer) oos.readObject();
            User u1 = (User) oos.readObject();

            System.out.println(i);
            System.out.println(u1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}