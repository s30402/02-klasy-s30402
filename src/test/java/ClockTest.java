package src.test.java;

import org.junit.Test;
import src.main.java.Clock;

import static org.junit.Assert.assertEquals;

public class ClockTest {

    @Test
    public void testTick() {
        Clock clock = new Clock(23,59,59);

        clock.toString();

        assertEquals("[00:00:00]", clock.tick() );

        for (int i = 0; i< 58; i++) {
            clock.tick();
        }

        assertEquals("[00:00:59]", clock.tick() );
        assertEquals("[00:01:00]", clock.tick() );

        for (int i = 0; i< 59; i++) {
            clock.tick();
        }

        assertEquals("[00:02:00]", clock.tick() );
    }

    @Test
    public void testSingleConstructor() {
        Clock clock = new Clock(86460);
        assertEquals("[00:01:00]", clock.toString());

        Clock clock2 = new Clock(479);
        assertEquals("[00:07:59]", clock2.toString());
    }

}
