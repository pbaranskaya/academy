package by.academy.DealHW;

import java.util.regex.Pattern;

public class BelarussianPhoneValidator implements Validator {

    public static final Pattern p = Pattern.compile("\\+375(29|33|25)\\d{7}");

    @Override
    public Pattern getPattern() {
        return p;
    }

    public static void main(String[] args) {

        Validator v = new BelarussianPhoneValidator();
        System.out.println(v.validate("+37529111111111"));

    }
}
