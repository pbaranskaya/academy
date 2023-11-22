package by.academy.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern; //8 задача

public class RegexDemo2 {
    public static void main(String[] args) {

        String[] strings = {"cab", "ccab", "cccab"};
        Pattern p = Pattern.compile("^c+ab$");
        for (int i = 0; i < strings.length; i++) {
            Matcher m = p.matcher(strings[i]);
            boolean b = m.matches();
            System.out.println(b);
        }



    }
}
