package isp.lab6.exercise2;

import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Vehicle {

    //VIN (Vehicle Identification Number), license plate, make, model, and year
    private int VIN;
    private String licensePlate;
    private String make;//marca
    private String model;
    private int year;

    public Vehicle(int VIN, String licensePlate, String make, String model, int year) {
        this.VIN = VIN;
        this.licensePlate = licensePlate.toUpperCase(Locale.ROOT);
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return getVIN() == vehicle.getVIN();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVIN());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + VIN +
                ", licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
