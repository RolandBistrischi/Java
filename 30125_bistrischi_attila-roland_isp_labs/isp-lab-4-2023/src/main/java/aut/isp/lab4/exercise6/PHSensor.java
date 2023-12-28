package aut.isp.lab4.exercise6;

public class PHSensor extends Sensor {
    private float value;

    public PHSensor(String manufacturer, String model, float value) {
        super(manufacturer, model);
        this.value = value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public float getPHValue() {
        return value;
    }

    @Override
    public int getTemperatureValue() {
        return 0;
    }

    @Override
    public float getLevelValue() {
        return 0;
    }
}
