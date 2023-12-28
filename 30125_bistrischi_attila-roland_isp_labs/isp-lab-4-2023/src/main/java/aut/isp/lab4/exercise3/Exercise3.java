package aut.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Filip.SRL", "4785HF45H745GH678");
        AquariumController aquariumController = new AquariumController(fishFeeder, "Lenowo", "23CX90KVN547", (float) 3.14, (float) 2.73);
        //System.out.println(aquariumController.toString());
        //aquariumController.setCurrentTime((float)2.73);
        //aquariumController.setCurrentTime((float)1.93);
        aquariumController.getFeeder().setMeals(-1);
        aquariumController.setCurrentTime(-1);
        aquariumController.setCurrentTime((float) 2.73);

        System.out.println(aquariumController.toString());
    }
}
