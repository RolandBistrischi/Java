
package isp.lab3.exercise3;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Dacia", "Spring", 150, 'B');
        Vehicle vehicle2 = new Vehicle("Tesla", "S", 120, 'E');
        Vehicle vehicle3 = new Vehicle("Dacia", "Spring", 150, 'B');

        vehicle1.setModel("Golan");
        vehicle2.setFuelType('B');
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.getFuelType());
        System.out.println(Vehicle.nr);

        if (vehicle1.equals(vehicle2))
            System.out.println("Vehiculele sunt egale");
        else
            System.out.println("Vehiculele sunt diferite");


    }
}
