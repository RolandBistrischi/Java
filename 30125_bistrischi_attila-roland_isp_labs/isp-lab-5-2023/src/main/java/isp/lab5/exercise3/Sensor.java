package isp.lab5.exercise3;

public abstract class Sensor {
    private String installLocation;
    private String name;

    public Sensor(String installLocation, String name) {
        this.installLocation = installLocation;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Sensor{" +
                "installLocation='" + installLocation + '\'' + '\n' +
                ", name='" + name + '\'' +
                '}';
    }
}
