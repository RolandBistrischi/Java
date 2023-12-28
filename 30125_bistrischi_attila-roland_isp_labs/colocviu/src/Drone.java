public abstract class Drone {
    private String model;
    private double max_flight;

    public Drone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMax_flight() {
        return max_flight;
    }

    public void setMax_flight(double max_flight) {
        this.max_flight = max_flight;
    }

    public abstract void displayInfo();


    @Override
    public String toString() {
        return "Drone{" +
                "model='" + model + '\'' +
                ", max_flight=" + max_flight +
                '}';
    }
}
