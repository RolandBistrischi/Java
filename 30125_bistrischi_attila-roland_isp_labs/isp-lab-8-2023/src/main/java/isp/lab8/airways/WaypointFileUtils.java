package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WaypointFileUtils {
    public static void writeWaypoint(Waypoint waypoint, File routedir) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileWriter(new File(routedir, waypoint.getName() + ".json")), waypoint);
    }

    public static List<Waypoint> getWaypoints(File routedir) throws IOException {
        List<Waypoint> waypoints = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        File[] waypointFiles = routedir.listFiles();

        for (File wp : waypointFiles) {
            Waypoint waypoint = objectMapper.readValue(wp, Waypoint.class);
            waypoints.add(waypoint);
        }
        return waypoints;
    }
}
