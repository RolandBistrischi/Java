package isp.lab5.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise2Test {
    @Test
    public void ExTest() {
        Laptop laptop = new Laptop(54);
        SmartPhone smartPhone = new SmartPhone(20);
        SmartWach smartWach = new SmartWach(0);

        laptop.charge(30);
        assertEquals(79, laptop.getBatteryLevel());

        smartWach.charge(10);
        assertEquals(20, smartWach.getBatteryLevel());

        smartPhone.charge(60);
        assertEquals(80, smartPhone.getBatteryLevel());
    }
}
