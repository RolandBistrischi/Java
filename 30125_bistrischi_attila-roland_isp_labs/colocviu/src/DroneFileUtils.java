/*import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DroneFileUtils {
    public static void writeDrone(Drone drone, File routeDir, String modelName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileWriter(new File(routeDir, modelName + ".json")), drone);
    }

    public static ArrayList<Drone> getDrones(File routeDir) throws IOException {
        ArrayList<Drone> drones = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        File[] droneFiles = routeDir.listFiles();

        assert droneFiles != null;
        for (File file : droneFiles) {
            Drone drone = objectMapper.readValue(file, Drone.class);
            drones.add(drone);
        }
        return drones;
    }
}
*/