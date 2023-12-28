public class FixedWing extends Drone {

    public FixedWing() {
    }

    @Override
    public void displayInfo() {
        System.out.println("Fixed-Wing: " + "model" + getModel() + "max range:" + getMax_flight());
    }
}



