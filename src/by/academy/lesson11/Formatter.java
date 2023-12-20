package by.academy.lesson11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatter {

    public static void main(String[] args) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse("01-01-2023", formatter);
        System.out.println(localDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate2 = LocalDate.parse("01/01/2023", formatter2);
        System.out.println(localDate);



    }
}
