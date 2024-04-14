package src.main.java;

import java.util.Objects;

public class MyDate {

    private int day, month, year;

    public MyDate (int d, int m, int y) {
        try {
            if (d >= 0 && d <= 31)      { this.day   = d; } else { throw new IllegalStateException("day"); }
        } catch (Exception e) {
            System.out.println("Incorrect day value!");
            this.day = 0;
        }

        try {
            if (m >= 0 && m <= 12)      { this.month = m; } else { throw new IllegalStateException("month"); }
        } catch (Exception e) {
            System.out.println("Incorrect month value!");
            this.month = 0;
        }

        try {
            if (y >= 1990 && y <= 2050) { this.year  = y; } else { throw new IllegalStateException("year"); }
        } catch (Exception e) {
            System.out.println("Incorrect year value!");
            this.year = 0;
        }
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
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
        return day + "/" + month + "/" + year;
    }
}
