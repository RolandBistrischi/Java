package aut.isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        //create an object

        AquariumController aquariumController = new AquariumController("Da_Boy", "pita", 8);
        aquariumController.setCurrentTime((float) 7.568);
        System.out.println(aquariumController.toString());
    }
}
