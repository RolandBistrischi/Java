package aut.isp.lab4.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

public class AquariumControllerTest {

    @Test
    public void AquariumTest() {
        FishFeeder fishFeeder = new FishFeeder("Filip.SRL", "4785HF45H745GH678");
        AquariumController aquariumController = new AquariumController(fishFeeder, "Lenowo", "23CX90KVN547", (float) 3.14, (float) 2.73);
        assertEquals("feeder=FishFeeder{manufacturer='Filip.SRL', model='4785HF45H745GH678', meals=14}\n" +
                "manufacturer=Lenowo\n" +
                "model=23CX90KVN547\n" +
                "currentTime=3.14\n" +
                "feedtime=2.73", aquariumController.toString());
        aquariumController.setCurrentTime(-1);
        assertEquals("feeder=FishFeeder{manufacturer='Filip.SRL', model='4785HF45H745GH678', meals=14}\n" +
                "manufacturer=Lenowo\n" +
                "model=23CX90KVN547\n" +
                "currentTime=0.0\n" +
                "feedtime=2.73", aquariumController.toString());

    }
}
