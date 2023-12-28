package aut.isp.lab4.exercise5;

public class AquariumController {

    //attributs
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int temperature;
    private float lightOnTime;
    private float lightsOffTime;
    private Sensor sensorTemperature;
    private Sensor sensorLevel;
    private Actuator heater;
    private Actuator alarm;

    //constructors
    public AquariumController(FishFeeder feeder, String manufacturer, String model, float currentTime, float feedingTime, float lightOnTime,
                              float lightsOffTime, int temperature, Sensor sensorTemperature, Sensor sensorLevel, Actuator heater, Actuator alarm) {
        this.feeder = feeder;
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
        this.lightOnTime = lightOnTime;
        this.lightsOffTime = lightsOffTime;
        this.temperature = temperature;
        this.sensorTemperature = sensorTemperature;
        this.sensorLevel = sensorLevel;
        this.heater = heater;
        this.alarm = alarm;
    }

    //methods
    public void setCurrentTime(float currentTime) {
        if (currentTime > 0)
            this.currentTime = currentTime;
        else
            this.currentTime = 0;
        if (this.feedingTime == currentTime)
            feeder.feed();
    }

    public void setFeedingTime(float feedingTime) {
        if (feedingTime >= 0)
            this.feedingTime = feedingTime;
        else this.feedingTime = 0;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public String verifcheckTemperature() {


        return "Temperature is:" + temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void checkTemperature() {
        this.temperature = (int) sensorTemperature.getTemperatureValue();
        System.out.println(verifcheckTemperature());
/*
        if (sensorTemperature.getTemperatureValue() < 24)
            heater.turnOn();

        if (sensorTemperature.getTemperatureValue() > 27)
            heater.turnOff();
*/
        if (temperature <= 24)
            heater.turnOn();
        else if (temperature >= 27)
            heater.turnOff();
        else if(temperature<27){
            heater.turnOn();
        }



    }


    public void checkWaterLevel() {

        System.out.println("Water level is:" + sensorLevel.getLevelValue());
        if (sensorLevel.getLevelValue() < 20)
            alarm.turnOn();
        else
            alarm.turnOff();
    }

    @Override
    public String toString() {
        return "feeder=" + feeder + '\n'
                + "manufacturer=" + manufacturer + '\n'
                + "model=" + model + '\n'
                + "currentTime=" + currentTime + '\n'
                + "feedtime=" + feedingTime + '\n'
                + "lightOn=" + lightOnTime + '\n'
                + "lightOff=" + lightsOffTime + '\n'
                + "sensorTemperature=" + sensorTemperature + '\n'
                + "sensorLevel=" + sensorLevel + '\n'
                + "heater=" + heater + '\n'
                + "alarm=" + alarm;
    }
}
