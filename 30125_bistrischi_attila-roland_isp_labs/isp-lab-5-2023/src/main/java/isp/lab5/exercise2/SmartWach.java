package isp.lab5.exercise2;

public class SmartWach implements Chargeable {
    private int batteryLevel;

    public SmartWach(int batteryLevel) {
        this.batteryLevel = Math.max(Math.min(batteryLevel, 100), 0);
    }

    @Override
    public void charge(int duration) {
        int incrementRate = 20;
        int timeUnit = 10;
        int increment = duration * incrementRate / timeUnit;
        batteryLevel = Math.min(batteryLevel + increment, 100);
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public String toString() {
        return "SmartWach{" +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
