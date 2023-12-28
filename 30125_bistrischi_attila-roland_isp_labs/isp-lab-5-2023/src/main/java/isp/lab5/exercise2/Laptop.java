package isp.lab5.exercise2;

public class Laptop implements Chargeable {
    private int batteryLevel;

    public Laptop(int batteryLevel) {
        this.batteryLevel = Math.max(Math.min(batteryLevel, 100), 0);
    }


    @Override
    public void charge(int duration) {
        int incrementRate = 50;
        int timeUnit = 60;
        int increment = duration * incrementRate / timeUnit;
        batteryLevel = Math.min(batteryLevel + increment, 100);
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryLevel=" + batteryLevel +
                '}';
    }
}
