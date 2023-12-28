
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Drone> drones = new ArrayList<>();


        JFrame frame = new JFrame("Drone Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);

        JPanel panel = new JPanel();

        JTextField textFieldModel = new JTextField(20);
        JTextField textFieldRange = new JTextField(20);
        JTextField textFieldType = new JTextField(20);

        JTextArea textArea = new JTextArea(10, 30);


        JButton buttonAdd = new JButton("ADD");
        JButton buttonSearch = new JButton("Search");
        JButton buttonDisplay = new JButton("Display");
        JButton buttonSave = new JButton("Save");
        JButton buttonLoad = new JButton("Load");

        //addDrone(textFieldModel, textFieldRange, textFieldType, buttonAdd);
        /*buttonAdd.addActionListener(new ActionListener() {
            void addDrone() {

            }
        });

        buttonSearch.addActionListener(new ActionListener() {

        });

        buttonDisplay.addActionListener(new ActionListener() {

        });

        buttonSave.addActionListener(new ActionListener() {

        });

        buttonLoad.addActionListener(new ActionListener() {

        });*/


        panel.add(textFieldModel);
        panel.add(textFieldRange);
        panel.add(textFieldType);
        panel.add(buttonAdd);
        panel.add(buttonSearch);
        panel.add(buttonDisplay);
        panel.add(buttonSave);
        panel.add(buttonLoad);
        panel.add(textArea);


        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
/*
    public static void addDrone(JTextField textFieldModel, JTextField textFieldRange, JTextField textFieldType, JButton buttonAdd) throws IOException {

        Drone drone = null;
        drone.setModel(textFieldModel.getText());
        drone.setMax_flight(textFieldRange.getText());


        String route="Drones/";
        File file=new File(route);
        DroneFileUtils.writeDrone(drone,file,textFieldModel.getText());

    }

    public static void displayDrone() throws IOException {
        String route="Drones/";
        File file=new File(route);
        ArrayList<Drone> drones=DroneFileUtils.getDrones(file);
    }*/
}