package src.main.java;

import java.util.Objects;

public class MyDate {

    private int day, month, year;

    public MyDate (int d, int m, int y) {
        setDay(d);
        setMonth(m);
        setYear(y);
    }

    public void setDay(int day) {
        try {
            if (day >= 0 && day <= 31) { this.day = day; } else { throw new IllegalStateException("day"); }
        } catch (Exception e) {
            System.out.println("Incorrect day value!");
            this.day = 0;
        }
    }

    public void setMonth(int month) {
        try {
            if (month >= 0 && month <= 12) { this.month = month; } else { throw new IllegalStateException("month"); }
        } catch (Exception e) {
            System.out.println("Incorrect month value!");
            this.month = 0;
        }
    }
    public void setYear(int year) {
        try {
            if (year >= 1990 && year <= 2050) { this.year  = year; } else { throw new IllegalStateException("year"); }
        } catch (Exception e) {
            System.out.println("Incorrect year value!");
            this.year = 0;
        }
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public String displayDate() {

         String dd, mm, yyyy;

        if (day < 10) { dd = "0" + day; } else dd = String.valueOf(day);
        if (month < 10) { mm = "0" + month; } else mm = String.valueOf(month);
        if (year == 0) { yyyy = "0000";} else yyyy = String.valueOf(year);

        return dd + "/" + mm + "/" + yyyy;
    }

}
