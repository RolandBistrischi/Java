package aut.isp.lab4.exercise6;


public class TemperatureSensor extends Sensor {
    private int value;

    public TemperatureSensor(String manufacturer, String model, int value) {
        super(manufacturer, model);
        this.value = value;

    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getTemperatureValue() {
        return value;
    }

    @Override
    public float getLevelValue() {
        return 0;
    }

    @Override
    public float getPHValue() {
        return 0;
    }
}
