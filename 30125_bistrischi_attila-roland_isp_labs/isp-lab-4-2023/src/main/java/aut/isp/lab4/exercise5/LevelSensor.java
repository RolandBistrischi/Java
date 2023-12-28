package aut.isp.lab4.exercise5;

public class LevelSensor extends Sensor {

    private float value;

    public LevelSensor(String manufacturer, String model, int value) {
        super(manufacturer, model);
        this.value = value;
    }


    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public float getLevelValue() {
        return value;
    }
    @Override
    public int getTemperatureValue() {
        return 0;
    }


}
