package by.academy.HW4;

import java.time.LocalDate;

public class CustomDate {

    public Year year;
    public Month month;
    public Day day;
    static DaysOfWeek dayOfWeek;

    public CustomDate() {
        super();
    }

    public CustomDate(int year, int month, int day) {
        super();
        this.year = this.new Year(year);
        this.month = this.new Month(month);
        this.day = this.new Day(day);
        this.enumDayOfWeek();
    }

    public CustomDate(String strDate) {
        super();
//        this.year = new Year(Integer.parseInt(strDate.substring(6)));
//        this.month = new Month(Integer.parseInt(strDate.substring(3, 5)));
//        this.day = new Day(Integer.parseInt(strDate.substring(0, 2)));
    }

    public LocalDate toLocalDate() {
        return LocalDate.of(this.year.value, this.month.value, this.day.value);
    }

    public void printDayOfWeek() {
        System.out.println("День недели (номер): " + this.toLocalDate().getDayOfWeek().getValue());
    }

    public class Year {
        int value;

        public Year(int year) {
            this.value = year;
        }

    }

    public class Month {
        int value;
        String name;
        int daysMonth;
        Year year;

        public Month(int month) {
            this.value = month;
        }

    }

    public class Day {
        int value;
        String name;

        public Day(int day) {
            this.value = day;
        }
    }

    public void enumDayOfWeek() {
        switch (this.toLocalDate().getDayOfWeek().toString()) {
            case "MONDAY":
                dayOfWeek = DaysOfWeek.MONDAY;
                break;
            case "TUESDAY":
                dayOfWeek = DaysOfWeek.TUESDAY;
                break;
            case "WEDNESDAY":
                dayOfWeek = DaysOfWeek.WEDNESDAY;
                break;
            case "THURSDAY":
                dayOfWeek = DaysOfWeek.THURSDAY;
                break;
            case "FRIDAY":
                dayOfWeek = DaysOfWeek.FRIDAY;
                break;
            case "SATURDAY":
                dayOfWeek = DaysOfWeek.SATURDAY;
                break;
            case "SUNDAY":
                dayOfWeek = DaysOfWeek.SUNDAY;
                break;
        }
    }

    public void printCustomDayOfWeek() {
        System.out.println("День недели в виде перечисления: " + this.dayOfWeek.name);
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}

