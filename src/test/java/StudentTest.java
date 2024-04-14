package src.test.java;

import org.junit.*;
import src.main.java.Card;
import src.main.java.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
public class StudentTest {

    @Test
    public void testAddObecnosc() {
        Student s1 = new Student();

        s1.setImie("Dariusz"); s1.setNazwisko("Brown"); s1.setIndex("s1");
        s1.setObecnosc(15); s1.setOcena(4);

        assertEquals("0.15", 0.15, s1.getObecnosc(), 0.001);
    }

    @Test
    public void testAddNullImie() {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setImie();

        assertEquals("Unknown", s1.getImie());
        assertEquals("Unknown", s2.getImie());
    }

    @Test
    public void testAddImie() {
        Student s1 = new Student();
        s1.setImie("Dariusz");

        assertEquals("Dariusz", s1.getImie());
    }

    @Test
    public void testAddOcena() {
        Student s1 = new Student();

        s1.setImie("Dariusz"); s1.setNazwisko("Brown"); s1.setIndex("s1");
        s1.setObecnosc(15); s1.setOcena(4);

        assertEquals(2, s1.getOcena());
    }
}
