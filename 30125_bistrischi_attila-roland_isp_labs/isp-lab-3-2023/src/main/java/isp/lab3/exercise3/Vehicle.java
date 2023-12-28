package isp.lab3.exercise3;

import java.util.Objects;

public class Vehicle {

    private String model;
    private String type;
    private int speed;
    private char fuelType;
    static int nr;

    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        nr++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public char getFuelType() {
        return fuelType;
    }

    public void setFuelType(char fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return model + " (" + type + ')' + " speed " + speed + " fuel type " + fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return speed == vehicle.speed && fuelType == vehicle.fuelType && model.equals(vehicle.model) && type.equals(vehicle.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, speed, fuelType);
    }
}
