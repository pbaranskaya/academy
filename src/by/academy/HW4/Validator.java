package by.academy.HW4;

import java.util.regex.Pattern;

import java.util.regex.Pattern;

public interface Validator {

    Pattern getPattern();

    default boolean validate(String string) {
        return getPattern().matcher(string).matches();
    }
}
