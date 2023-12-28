package aut.isp.lab4.exercise4;

public class AquariumController {

    //attributs
    private FishFeeder feeder;
    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedtime;

    private float lightOnTime;
    private float lightsOffTime;

    //constructors
    public AquariumController(FishFeeder feeder, String manufacturer, String model, float currentTime, float feedtime, float lightOnTime, float lightsOffTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedtime = feedtime;
        this.feeder = feeder;
        this.lightOnTime = lightOnTime;
        this.lightsOffTime = lightsOffTime;
    }


    //methods
    public void setCurrentTime(float currentTime) {
        if (currentTime > 0)
            this.currentTime = currentTime;
        else
            this.currentTime = 0;
        if (this.feedtime == currentTime)
            feeder.feed();

        if (currentTime >= lightOnTime && currentTime < lightsOffTime)
            System.out.println("Light on");
        else
            System.out.println("Light off");
    }

    public void setFeedingtime(float feedtime) {
        this.feedtime = feedtime;
    }

    public void setFeeder(FishFeeder feeder) {
        this.feeder = feeder;
    }

    public float getCurrentTime() {
        return currentTime;
    }

    public float getFeedingTime() {
        return feedtime;
    }

    public FishFeeder getFeeder() {
        return feeder;
    }

    @Override
    public String toString() {
        return "feeder=" + feeder + '\n'
                + "manufacturer=" + manufacturer + '\n'
                + "model=" + model + '\n'
                + "currentTime=" + currentTime + '\n'
                + "feedtime=" + feedtime + '\n'
                + "lightOn=" + lightOnTime + '\n'
                + "lightOff=" + lightsOffTime;
    }
}
