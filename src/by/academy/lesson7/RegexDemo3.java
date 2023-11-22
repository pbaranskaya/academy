package by.academy.lesson7;
// Изменить регулярное выражение в примере – пусть reference1.org тоже считается ссылкой.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        System.out.println(test("google.com"));
        System.out.println(test("reference1.by"));
        System.out.println(test("reference1.org"));
    }

    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
