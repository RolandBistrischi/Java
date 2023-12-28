package isp.lab10.raceapp;

import javax.swing.*;
import java.lang.reflect.Executable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Race!");
        JFrame frameSem = new JFrame("Semaphore");
        frameSem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SemaphorePanel semaphorePanel = new SemaphorePanel();
        frameSem.getContentPane().add(semaphorePanel);
        frameSem.pack();
        frameSem.setVisible(true);
        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();


        JFrame frameCar = new JFrame("Car Race");
        frameCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CarPanel carPanel = new CarPanel();
        frameCar.getContentPane().add(carPanel);
        frameCar.pack();
        frameCar.setSize(500, 300);
        frameCar.setVisible(true);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);


        semaphoreThread.join();
        PlaySound playSound = new PlaySound();
        playSound.playSound();

        car1.start();
        car2.start();
        car3.start();
        car4.start();

        ExTimer timer = new ExTimer();
        timer.start();

        car1.join();
        car2.join();
        car3.join();
        car4.join();
        playSound.stopSound();


        timer.end();
    }
}
