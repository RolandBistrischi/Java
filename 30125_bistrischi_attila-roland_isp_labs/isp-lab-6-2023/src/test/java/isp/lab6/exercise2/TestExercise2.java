package isp.lab6.exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;


public class TestExercise2 {
    private Set<Vehicle> vehicles;

    public TestExercise2() {
        vehicles = new HashSet<>();
    }

    @Test
    public void testAddVehicle() {
        Vehicle vehicle1 = new Vehicle(1234, "MM 08 GBR", "Dacia", "Spring", 2022);
        vehicles.add(vehicle1);
        assertTrue(vehicles.contains(vehicle1));
    }

    @Test
    public void testRemoveVehicle() {
        Vehicle vehicle1 = new Vehicle(1234, "MM 08 GBR", "Dacia", "Spring", 2022);
        vehicles.add(vehicle1);
        vehicles.remove(vehicle1);
        assertFalse(vehicles.contains(vehicle1));
    }

    @Test
    public void testCheckVehicle() {
        Exercise2 testExercise2 = new Exercise2();
        Vehicle vehicle1 = new Vehicle(1234, "MM 08 GBR", "Dacia", "Spring", 2022);
        testExercise2.addVehicle(vehicle1);

        //vehicles.remove(vehicle1);
        assertFalse(testExercise2.checkVehicle(1235));
        assertTrue(testExercise2.checkVehicle(1234));
    }
}
