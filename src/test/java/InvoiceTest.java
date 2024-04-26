package src.test.java;

import org.junit.Test;
import src.main.java.Invoice;
import static org.junit.Assert.assertEquals;

public class InvoiceTest {

    @Test
    public void testAmount() {
        Invoice invoice = new Invoice("1", "2", 5, 2.5);

        assertEquals(12.5, invoice.Amount(), 0.001);
    }

}
