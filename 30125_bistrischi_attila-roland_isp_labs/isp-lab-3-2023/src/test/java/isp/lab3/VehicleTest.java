package isp.lab3;

import isp.lab3.exercise3.Vehicle;
import org.junit.Test;

import static org.junit.Assert.*;

public  class VehicleTest {
    @Test

    public void TesttoString() {

        Vehicle vehicle1 = new Vehicle("Dacia", "Spring", 150, 'B');
        Vehicle vehicle2 = new Vehicle("Tesla", "S", 120, 'E');
        assertEquals("Tesla (S) speed 120 fuel type E",vehicle2.toString());

    }
}