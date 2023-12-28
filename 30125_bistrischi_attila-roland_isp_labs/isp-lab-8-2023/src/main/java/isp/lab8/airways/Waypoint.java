package isp.lab8.airways;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Example waypoint class which can be extended to be used in implementation of the exercise. Add constructor, getters, setters, etc.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Waypoint {
    private int index = -1;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;

    public void incrementIndex() {
        index++;
    }
}
