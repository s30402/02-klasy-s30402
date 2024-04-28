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

    @Test
    public void setters_getters_Invoice() {
        Invoice invoice = new Invoice("1", "2", 5, 2.5);

        invoice.setProduct_number("2");
        assertEquals("2", invoice.getProduct_number());

        invoice.setProduct_description("desc");
        assertEquals("desc", invoice.getProduct_description());

        invoice.setQuantity(5);
        assertEquals(5, invoice.getQuantity());

        invoice.setPricePerItem(2.76);
        assertEquals(2.76, invoice.getPricePerItem(), 0.001);
    }

}
