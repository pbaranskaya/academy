package by.academy.lesson18;

import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {

        File dirs = new File("src/io");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        File file = new File(dirs, "a.txt");
        File file1 = new File(dirs, "b.txt");

        if (!file.exists()) {
            file.createNewFile();
        }


        if (!file1.exists()) {
            file1.createNewFile();
        }

        try (OutputStream output = new FileOutputStream(file); // инпут читающий, аутпут пишущий
             InputStream input = new FileInputStream(file);
             OutputStream output2 = new FileOutputStream(file1)) {
            char[] symbols = {'q', 'w', 'e', 'r', 't', 'y'};
            for (int i = 0; i < symbols.length; i++) {
                output.write(symbols[i]);
            }
            output.flush();
            int size = input.available();
            for (int i = 0; i < size; i++) {
                int c = input.read();
                System.out.println((char) c);
                output2.write(c);
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

