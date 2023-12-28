package aut.isp.lab4.exercise1;

public class AquariumController {

    //attributs
    private String manufacturer;
    private String model;
    private float currentTime;

    //constructors
    public AquariumController(String manufacturer, String model, float currentTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
    }

    //methods
    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
    }

    public float getCurrentTime() {
        return currentTime;
    }
    /*@Override
    public String toString() {
        return super.toString();
    }*/

    @Override
    public String toString() {
        return "manufacturer='" + manufacturer + '\'' + '\n' +
                "model='" + model + '\'' + '\n' +
                "currentTime=" + currentTime;
    }
}
