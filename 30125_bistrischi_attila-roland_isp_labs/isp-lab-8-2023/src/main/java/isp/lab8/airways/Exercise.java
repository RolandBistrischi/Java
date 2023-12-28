package isp.lab8.airways;

import examples.files.FilesAndFoldersUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Waypoint waypoint = new Waypoint();
        //1. create route
        //menu asks imput route
        //String workingFolder = "c:\\routes";
        //WaypointFileUtils.getWaypoints();
        //2. add waypoint
        //menu asks imput waypoint atributes
        System.out.println("Apasati:\n1-pentru a aduga waypoint\n2-pentru a sterge o ruta\n3-pentru a calcula distanta");
        int a = 0;
        a = scanner.nextInt();
        switch (a) {
            case 1:
                addWaypoint(waypoint);
                break;
            case 2:
                deleteRoute();
                break;
            case 3:
                routeTotalDistance();
                break;
            default:
                System.out.println("Nu se face nimic");
                break;
        }

        //3. calculate distance for route
        //menu asks the route
        //load all the files from the route folder into memory
        //calculate distance beetwen each consecutive points    LRCL-TASOD-SOPAV
        //46.7852,23.6862,47.0548,23.9212
        //System.out.println("distanta este:" + WaypointDistanceCalculator.calculateDistance(46.7852, 23.6862, 47.0548, 23.9212));

        //4.delete route
        //menu asks for route folder (ex: LRCL-LROP)- delete it

    }


    public static void addWaypoint(Waypoint waypoint) throws IOException {
        String nume_route;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati ruta: ");
        nume_route = scanner.nextLine();
        FilesAndFoldersUtil.createFolder("routes/" + nume_route);


        System.out.println("Adaugati waypoint.");
        System.out.println("dati numele: ");
        waypoint.setName(scanner.nextLine());
        System.out.println("dati latitude: ");
        waypoint.setLatitude(scanner.nextDouble());
        System.out.println("dati longitudine: ");
        waypoint.setLongitude(scanner.nextDouble());
        System.out.println("dati altitudinea: ");
        waypoint.setAltitude(scanner.nextInt());
        waypoint.incrementIndex();
        File file = new File("routes", nume_route);
        //try {
        WaypointFileUtils.writeWaypoint(waypoint, file);
        //} catch (IOException e) {
        //System.out.println("nu exista ruta");
        //}

        System.out.println(waypoint.toString());
    }

    public static void displayRoutes() {
        File routeFile = new File("routes");
        File[] waypoints = routeFile.listFiles();
        assert waypoints != null;
        for (File file : waypoints) {
            System.out.println(file.getName());
        }
    }

    public static void deleteRoute() {

        String nume_route;
        Scanner scanner = new Scanner(System.in);
        displayRoutes();
        System.out.println("Dati ruta: ");
        nume_route = scanner.nextLine();
        File routeDir = new File("routes/" + nume_route);


        if (routeDir.exists()) {
            String[] entries = routeDir.list();
            assert entries != null;
            for (String entry : entries) {
                File currentFile = new File(routeDir.getPath(), entry);
                currentFile.delete();
            }
            routeDir.delete();
            System.out.println("Fisierul a fost sters");
        } else System.out.println("Nu se poate sterge fisierul");
    }

    public static void routeTotalDistance() throws IOException {
        String nume_route;
        Scanner scanner = new Scanner(System.in);
        displayRoutes();
        System.out.println("Dati ruta: ");
        nume_route = scanner.nextLine();
        File routeDir = new File("routes/" + nume_route);


        if (routeDir.exists()) {
            List<Waypoint> waypoints;
            waypoints = WaypointFileUtils.getWaypoints(routeDir);
            int i = 0;
            for (Waypoint wp : waypoints) {
                wp.setIndex(i);
                System.out.println("index: " + wp.getIndex() + "\nname: " + wp.getName() + "\nlatitudine: " + wp.getLatitude() + "\nLongitudine: " + wp.getLongitude() + "\nAltitudine: " + wp.getAltitude());
                i++;
            }
            double distance = 0;
            Waypoint waypoint = waypoints.get(0);
            for (Waypoint wp : waypoints) {
                distance += WaypointDistanceCalculator.calculateDistance(waypoint.getLatitude(), waypoint.getLongitude(), wp.getLatitude(), wp.getLongitude());
                waypoint = wp;
            }
            System.out.println("distanta= " + distance);
        } else System.out.println("Fisierul nu exista");
    }

}
