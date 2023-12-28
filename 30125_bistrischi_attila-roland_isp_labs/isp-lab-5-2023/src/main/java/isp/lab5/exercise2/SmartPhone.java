package isp.lab5.exercise2;

import java.util.concurrent.TimeUnit;

public class SmartPhone implements Chargeable {
    private int batteryLevel;

    public SmartPhone(int batteryLevel) {
        this.batteryLevel = Math.max(Math.min(batteryLevel, 100), 0);
    }

    @Override
    public void charge(int duration) {
        int incrementRate = 60;
        int timeUnit = 60;
        int increment = duration * incrementRate / timeUnit;
        batteryLevel = Math.min(batteryLevel + increment, 100);
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}
