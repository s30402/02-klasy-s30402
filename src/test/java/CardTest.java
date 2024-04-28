package src.test.java;

import org.junit.*;
import src.main.java.Card;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CardTest {

    @Test
    public void testSetValue() {
        Card card = new Card();
        card.setValue(5);
        assertEquals("5", 5, card.getValue());
    }

    @Test
    public void testSetColor() {
        Card card = new Card();
        card.setColor("PIK");
        assertEquals("PIK", "PIK", card.getColor());
    }

    @Test
    public void testSetWrongColor() {
        Card card = new Card();
        assertThrows(IllegalStateException.class, () -> card.setColor("RED"));
    }

    @Test
    public void testWar() {
        Card card = new Card();
        card.setValue(1);

        Card card2 = new Card();
        card2.setValue(10);

        assertEquals("Card 1 (Ass)", 1, card.WarResult(card2));

        card.setValue(5);
        assertEquals("Card 2", 2, card.WarResult(card2));

        card.setValue(7);
        card2.setValue(7);
        assertEquals("Same", 0, card.WarResult(card2));
    }

}
