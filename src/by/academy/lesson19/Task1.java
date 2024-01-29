package by.academy.lesson19;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> marks = new HashMap<>();
        marks.put("Петров", 10);
        marks.put("Иванов", 9);

        File dirs = new File("src/file");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }

        File file = new File(dirs, "file.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        try (BufferedReader fr = new BufferedReader(new FileReader(file));
             FileWriter fw = new FileWriter(file, true);
        ) {

            for (String key : marks.keySet()) {
                fw.write(key + " - " + marks.get(key) + " ");
            }

            fw.flush();

            String s;
            while ((s = fr.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
