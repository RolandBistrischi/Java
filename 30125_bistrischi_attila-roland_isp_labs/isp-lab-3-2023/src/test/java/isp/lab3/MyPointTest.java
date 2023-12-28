package isp.lab3;

import isp.lab3.exercise4.MyPoint;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class MyPointTest {

    @Test
    public void TestDistance() {
        MyPoint myPoint1 = new MyPoint(1, 1, 1);
        MyPoint myPoint2 = new MyPoint(2, 2, 2);

        assertEquals(1.73205, myPoint1.distance(myPoint2), 0.0001);
    }
}