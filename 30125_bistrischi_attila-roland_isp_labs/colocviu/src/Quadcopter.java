public class Quadcopter extends Drone {
    public Quadcopter() {
    }

    @Override
    public void displayInfo() {
        System.out.println("Quadcopter: " + "model" + getModel() + "max range:" + getMax_flight());
    }
}
