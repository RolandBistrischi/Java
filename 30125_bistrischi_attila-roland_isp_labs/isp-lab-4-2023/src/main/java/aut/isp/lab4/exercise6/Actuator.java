package aut.isp.lab4.exercise6;


public abstract class Actuator {
    private String manufacturer;
    private String model;

    public Actuator(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void turnOn() {}

    public void turnOff() {}


    @Override
    public String toString() {
        return "Actuator{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
