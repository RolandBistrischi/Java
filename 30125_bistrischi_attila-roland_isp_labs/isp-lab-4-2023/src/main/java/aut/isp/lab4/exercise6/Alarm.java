package aut.isp.lab4.exercise6;

public class Alarm extends Actuator {

    public Alarm(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Alarm is on");
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Alarm is off");
        super.turnOff();
    }
}
