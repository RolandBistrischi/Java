package aut.isp.lab4.exercise5;


public class Exercise5 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Filip.SRL", "4785HF45H745GH678");
        LevelSensor levelSensor = new LevelSensor("Claudiu", "R4VB67V6C47RBGGG", 15);
        TemperatureSensor temperatureSensor = new TemperatureSensor("MMMM", "G67G6", 4);
        Heater heater = new Heater("Lenowo","Risen 7");
        Alarm alarm = new Alarm("ziaomi","D22");

        AquariumController aquariumController = new AquariumController(fishFeeder, "Lenowo", "23CX90KVN547",
                (float) 3.14, (float) 2.73, 3, 10, 20,
                (Sensor) levelSensor, (Sensor) temperatureSensor, (Actuator) heater, (Actuator) alarm);

        System.out.println(aquariumController.toString());
    }
}
