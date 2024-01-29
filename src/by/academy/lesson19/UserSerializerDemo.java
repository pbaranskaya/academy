package by.academy.lesson19;

import java.io.*;

public class UserSerializerDemo {
    public static void main(String[] args) throws IOException {
        User u1 = new User();

        u1.setId(1l);
        u1.setLogin("superuser1");
        u1.setPassword("qwerty");

        File users = new File("src/io/users.txt");
        if (!users.exists()) {
            users.createNewFile();
        }

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(users))) {

            oos.writeObject(1);
            oos.writeObject(u1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}