package aut.isp.lab4.exercise5;

public abstract class Sensor {
    private String manufacturer;
    private String model;

    public Sensor(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public abstract int getTemperatureValue();

    public abstract float getLevelValue();


    @Override
    public String toString() {
        return "Sensor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
