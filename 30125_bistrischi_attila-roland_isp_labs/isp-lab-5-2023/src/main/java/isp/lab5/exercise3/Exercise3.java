package isp.lab5.exercise3;

public class Exercise3 {

    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[4];
        sensors[0] = new PressureSensor("hol", "Pressure Sensor 1", 2);
        sensors[1] = new TemperatureSensor("hol", "Temperature Sensor 1", 20);
        sensors[2] = new PressureSensor("curte", "Pressure Sensor 2", 5);
        sensors[3] = new TemperatureSensor("curte", "Temperature Sensor 2", 40);
        MonitoringService monitoringService = new MonitoringService();

        for (int i = 0; i <= 3; i++)
            monitoringService.addSensor(sensors[i]);

        System.out.println("temperarura:" + monitoringService.getAverageTemperatureSensor() + '\n' + "toate:" + monitoringService.getAverageAllSensor());
    }
}
