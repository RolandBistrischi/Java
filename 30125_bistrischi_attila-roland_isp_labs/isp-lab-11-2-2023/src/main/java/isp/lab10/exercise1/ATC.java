package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class ATC {
    private List<Aircraft> aircraftList=new ArrayList<>();

    public void addAircraft(String id) {
        Aircraft aircraft = new Aircraft();
        aircraft.setId(id);
        aircraftList.add(aircraft);
    }

    public void sendCommand(String aircraftid, AtcCommand command) {
        //System.out.println("Aircraft with id " + id + " received command " + command);
        for (Aircraft aircraft : aircraftList) {
            if (aircraftid.equals(aircraft.getId())) {
                System.out.println("aircraft whith " + aircraft.getId() + "command " + command);
                aircraft.run();
            }
        }
    }

    public void showAircrafts() {
        //System.out.println("Display aircrfats.");
        for (Aircraft craft : aircraftList) {
            System.out.println("Aircraft "+craft.toString());
        }
    }
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}
