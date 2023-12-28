package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
    private Set<Vehicle> vehicles;

    public Exercise2() {
        vehicles = new HashSet<>();
    }

    public static void main(String[] args) {
        Exercise2 registry = new Exercise2();
        Vehicle vehicle1 = new Vehicle(1234, "MM 08 GBR", "Dacia", "Spring", 2022);

        registry.addVehicle(vehicle1);
        registry.addVehicle(new Vehicle(1235, "MM 09 GBR", "Ford", "Focus", 1999));
        registry.addVehicle(new Vehicle(1236, "MM 09 GBR", "Ford", "Focus", 1999));

        registry.displayRegistry();
        registry.removeVehicle(vehicle1);
        registry.displayRegistry();
        if(registry.checkVehicle(vehicle1.getVIN()))
            System.out.println("Vehicul:"+vehicle1);
        else
            System.out.println("Nu am gasit");
    }

    public void addVehicle(Vehicle vehicle) {
        if (!vehicles.contains(vehicle)) {
            vehicles.add(vehicle);
            System.out.println("Vehiculul a fost adaugat: " + vehicle);
        } else {
            System.out.println("Vehiculul deja exista: " + vehicle);
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        if (vehicles.contains(vehicle))
            vehicles.remove(vehicle);
    }

    public boolean checkVehicle(int VIN) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVIN() == VIN) {
                return true;
            }
        }
        return false;
    }

    public void displayRegistry() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
