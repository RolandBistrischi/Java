package isp.lab10.exercise1;

public class Aircraft implements Runnable {
    private String id;
    private int altitude = 1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void receiveAtcCommand(AtcCommand comm) {

    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id='" + id + '\'' +
                ", altitude=" + altitude +
                '}';
    }

    @Override
    public void run() {

    }
}
