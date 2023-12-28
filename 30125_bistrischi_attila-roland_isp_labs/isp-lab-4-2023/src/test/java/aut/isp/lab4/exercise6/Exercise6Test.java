package aut.isp.lab4.exercise6;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise6Test {
    @Test
    public void AquaTest() {
        FishFeeder fishFeeder = new FishFeeder("Filip.SRL", "4785HF45H745GH678");

        LevelSensor levelSensor = new LevelSensor("Claudiu", "R4VB67V6C47RBGGG", 15);
        TemperatureSensor temperatureSensor = new TemperatureSensor("MMMM", "G67G6", 4);
        PHSensor phSensor=new PHSensor("Gamma","H87H87",(float)7.5);

        Heater heater = new Heater("Lenowo", "Risen 7");
        Alarm alarm = new Alarm("ziaomi", "D22");

        AquariumController aquariumController = new AquariumController(fishFeeder, "Lenowo", "23CX90KVN547",
                (float) 3.14, (float) 2.73, 3, 10, 20,
                (Sensor) temperatureSensor,(Sensor) levelSensor, (Sensor) phSensor, (Actuator) heater, (Actuator) alarm);


        temperatureSensor.setValue(23);
        aquariumController.checkTemperature();
        assertEquals("Temperature is:23", aquariumController.verifcheckTemperature());

        temperatureSensor.setValue(25);
        aquariumController.checkTemperature();
        assertEquals("Temperature is:25", aquariumController.verifcheckTemperature());

        temperatureSensor.setValue(28);
        aquariumController.checkTemperature();
        assertEquals("Temperature is:28", aquariumController.verifcheckTemperature());

        temperatureSensor.setValue(25);
        aquariumController.checkTemperature();
        assertEquals("Temperature is:25", aquariumController.verifcheckTemperature());


        phSensor.setValue((float)6.8);
        aquariumController.checkPHLevel();
        assertEquals("Temperature is:25", aquariumController.verifcheckTemperature());

    }
}
