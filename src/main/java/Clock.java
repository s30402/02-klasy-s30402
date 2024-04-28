package src.main.java;

public class Clock {

    private int hours, minutes, seconds;

    //  ---------- ---------- ---------- CONSTRUCTOR'S ---------- ---------- ---------- //

    public Clock(int h, int m, int s) {
        setHours(h);
        setMinutes(m);
        setSeconds(s);
    }

    public Clock(int s) {

        int m,h;

        if (s > 59) {
            m = s / 60;

            if (m > 59) {
                h = m / 60;

                if (h > 23) {
                    setHours(0);
                } else {
                    setHours(m / 60);
                }

                setMinutes(m % 60);
            } else {
                setMinutes(s / 60);
            }

            setSeconds(s % 60);

        } else {
            setSeconds(s);
        }
    }

    public Clock() {
        setHours(12);
        setMinutes(0);
        setSeconds(0);
    }

    //  ---------- ---------- ---------- SETTER'S & GETTER'S ---------- ---------- ---------- //

    public void setHours(int hours) {
        try {
            if (hours >= 0 && hours <= 23) { this.hours = hours; } else { throw new IllegalStateException("day"); }
        } catch (Exception e) {
            System.out.println("Incorrect hours value!");
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        try {
            if (minutes >= 0 && minutes <= 59) { this.minutes = minutes; } else { throw new IllegalStateException("day"); }
        } catch (Exception e) {
            System.out.println("Incorrect minutes value!");
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        try {
            if (seconds >= 0 && seconds <= 59) { this.seconds = seconds; } else { throw new IllegalStateException("day"); }
        } catch (Exception e) {
            System.out.println("Incorrect seconds value!");
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    //  ---------- ---------- ---------- TICK'S ---------- ---------- ---------- //

    public String tick() {

        if (seconds != 59) {
            seconds++;
        } else {

            if (minutes !=59) {
                minutes++;
            } else {

                if (hours != 23) {
                    hours++;
                } else {
                    hours = 0;
                }

                minutes = 0;
            }

            seconds = 0;
        }

        return toString();

    }

    public String tickDown() {

        if (seconds != 0) {
            seconds--;
        } else {

            if (minutes !=0) {
                minutes--;
            } else {

                if (hours != 0) {
                    hours--;
                } else {
                    hours = 23;
                }

                minutes = 59;
            }

            seconds = 59;
        }

        return toString();

    }

    public String toString() {

        String hh,mm, ss;

        if (hours < 10) { hh = "0" + hours; } else hh = String.valueOf(hours);
        if (minutes < 10) { mm = "0" + minutes; } else mm = String.valueOf(minutes);
        if (seconds < 10) { ss = "0" + seconds; } else ss = String.valueOf(seconds);

        return "[" + hh + ":" + mm + ":" + ss + "]";
    }
}
