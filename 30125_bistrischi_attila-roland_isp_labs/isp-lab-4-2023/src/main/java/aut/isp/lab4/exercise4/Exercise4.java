package aut.isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Filip.SRL", "478985HF45H745GH678");
        AquariumController aquariumController = new AquariumController(fishFeeder, "Lenowo", "23CX90KVN547", (float) 3.14, (float) 2.73, (float) 6.30, (float) 12.30);
        System.out.println(aquariumController.toString());
        aquariumController.setCurrentTime((float)2.73);
    }
}
