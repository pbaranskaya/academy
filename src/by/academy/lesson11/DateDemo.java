package by.academy.lesson11;

import java.time.LocalDate;

public class DateDemo {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024,1,1);
        System.out.println(date.getDayOfWeek());
        date.isLeapYear();
    }
}
