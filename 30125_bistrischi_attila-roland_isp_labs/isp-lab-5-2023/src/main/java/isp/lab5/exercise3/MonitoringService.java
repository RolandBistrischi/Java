package isp.lab5.exercise3;

import java.util.ArrayList;
import java.util.List;

public class MonitoringService {
    private List<Sensor> sensors;

    public MonitoringService() {
        sensors = new ArrayList<>();
    }

    public MonitoringService(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public double getAverageTemperatureSensor() {
        int count = 0;
        double sum = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensor;
                sum = sum + temperatureSensor.getTemperature();
                count++;
            }
        }
        if (count > 0)
            return sum / count;
        else
            return 0;
    }

    public double getAverageAllSensor() {
        int count = 0;
        double sum = 0;
        for (Sensor sensor : sensors) {
            if (sensor instanceof TemperatureSensor) {
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensor;
                sum = sum + temperatureSensor.getTemperature();
                count++;
            } else if (sensor instanceof PressureSensor) {
                PressureSensor pressureSensor = (PressureSensor) sensor;
                sum = sum + pressureSensor.getPressure();
                count++;
            }
        }
        if (count > 0)
            return sum / count;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "MonitoringService{" +
                "sensors=" + sensors +
                '}';
    }
}
