package aut.isp.lab4.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumControllerTest {
    //implement minimal tests
    @Test
    public void AquariumTest() {
        AquariumController aquariumController = new AquariumController("Da_Boy", "pita", 8);
        assertEquals(8, aquariumController.getCurrentTime(), 0.001);
        aquariumController.setCurrentTime((float) 7.968);
        assertEquals("manufacturer='Da_Boy'\n" +
                "model='pita'\n" +
                "currentTime=7.968", aquariumController.toString());
    }
}
