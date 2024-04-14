package src.test.java;

import org.junit.*;
import src.main.java.Card;
import src.main.java.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
public class StudentTest {

    @Test
    public void testAddImie() {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setImie("Dariusz"); s1.setNazwisko("Brown"); s1.setIndex("s1");
        s1.setObecnosc(15); s1.setOcena(4);

        assertEquals("15", 15, s1.getObecnosc());
    }
}
