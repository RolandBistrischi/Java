package aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder fishFeeder = new FishFeeder("Eu.SRL", "78ERHEY7U7DEH");
        for (int i = 1; i < 16; i++)
            fishFeeder.feed();
        fishFeeder.fillUp();
        System.out.println(fishFeeder.toString());
    }
}
