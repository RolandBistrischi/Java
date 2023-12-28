package aut.isp.lab4.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumControllerTest {
    @Test
    public void AquriumTest() {
        FishFeeder fishFeeder = new FishFeeder("Filip.SRL", "478985HF45H745GH678");
        AquariumController aquariumController = new AquariumController(fishFeeder, "Lenowo", "23CX90KVN547", (float) 3.14, (float) 2.73, (float) 6.30, (float) 12.30);
        assertEquals("feeder=FishFeeder{manufacturer='Filip.SRL', model='478985HF45H745GH678', meals=14}\n" +
                "manufacturer=Lenowo\n" +
                "model=23CX90KVN547\n" +
                "currentTime=3.14\n" +
                "feedtime=2.73\n" +
                "lightOn=6.3\n" +
                "lightOff=12.3", aquariumController.toString());
    }
}
