package by.academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”
// Найти все подстроки "Java <X>" и распечатать их.
public class RegexDemo {
    public static void main(String[] args) {

        String s = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";


//        Pattern p = Pattern.compile("[a-zA-Z]+\\s+\\d+");
        Pattern p = Pattern.compile("Java\\s+\\d+");
        Matcher m = p.matcher(s);

        System.out.println("Find: ");
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            String match = s.substring(start,end);
            System.out.println(match.replaceAll("\\s+"," ")); // \\s+{2}


        }
    }
}
