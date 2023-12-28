package lab.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mihai.hulea
 */
public class ExampleTest {

    @Test
    public void testAdd() {
        assertEquals("Should add 2 numbers", 30, Example.add(10, 20));
    }

    @Test
    public void testSubstract() {
        assertEquals("Should substract 2 numbers", 5, Example.substract(15, 10));
    }

    @Test
    public void testMultipication() {
        assertEquals("Should multipi 2 numbers", 200, Example.multipiplication(10, 20));
    }

    @Test
    public void testDivide() {
        assertEquals("Should divide 2 numbers", 5, Example.divide(50, 10));
        assertEquals("Should divide 0/0", 0, Example.divide(0, 0));
    }
}
