package src.test.java;

import org.junit.Test;
import src.main.java.Numbers;
import static org.junit.Assert.assertEquals;

public class NumbersTest {

    @Test
    public void testAverage() {
        Numbers num = new Numbers(5,1,0);

        assertEquals(3, num.average(), 0.09);
    }

    @Test
    public void testMin() {
        Numbers num = new Numbers(-5,1,0);

        assertEquals(-5, num.min());
    }

    @Test
    public void testMax() {
        Numbers num = new Numbers(40,0,-21);

        assertEquals(40, num.max());
    }

    @Test
    public void testGeometric() {
        Numbers num = new Numbers(5,5,5);

        assertEquals(5, num.geometric(), 0.0001);
    }

}
