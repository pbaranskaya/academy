package by.academy.lesson7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMarherDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+\\.[a-z]{2,}");
        String text = "Используются файлы file1.doc, file2.txt. +" +
                "А еще было бы неплохо обратить внимание на файл file3.img" +
                "Также просмотрите содержимое file4.doc";

        Matcher m = p.matcher(text);


//        System.out.println("Full match: ");
//        System.out.println(m.matches());

        System.out.println("Find: ");
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            String match = text.substring(start,end);
            System.out.println(match);
        }
    }
}
