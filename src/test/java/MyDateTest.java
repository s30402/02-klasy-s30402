package src.test.java;

import org.junit.*;
import src.main.java.MyDate;

import static org.junit.Assert.assertEquals;

public class MyDateTest {

    @Test
    public void testCorrectDate() {
        MyDate d1 = new MyDate(15, 12, 2014);

        assertEquals("15/12/2014", d1.displayDate() );
    }

    @Test
    public void testInCorrectDay() {
        MyDate d1 = new MyDate(136, 12, 2014);

        assertEquals("0/12/2014", d1.displayDate() );
    }

    @Test
    public void testInCorrectMonth() {
        MyDate d1 = new MyDate(12, 126, 2014);

        assertEquals("12/0/2014", d1.displayDate() );
    }

    @Test
    public void testInCorrectYear() {
        MyDate d1 = new MyDate(12, 12, 201446);

        assertEquals("12/12/0", d1.displayDate() );
    }

    @Test
    public void testInCorrectAll() {
        MyDate d1 = new MyDate(12473, 12346, 201446);

        assertEquals("0/0/0", d1.displayDate() );
    }


    @Test
    public void testCorrectDateGetAll() {
        MyDate d1 = new MyDate(15, 12, 2014);

        assertEquals("15/12/2014", d1.displayDate() );

        assertEquals(15,    d1.getDay() );
        assertEquals(12,    d1.getMonth() );
        assertEquals(2014,  d1.getYear() );
    }

    @Test
    public void testInCorrectDayGetAll() {
        MyDate d1 = new MyDate(12473, 12346, 201446);

        assertEquals("0/0/0", d1.displayDate() );

        assertEquals(0, d1.getDay() );
        assertEquals(0, d1.getMonth() );
        assertEquals(0, d1.getYear() );
    }
}
