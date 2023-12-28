package isp.lab10.raceapp;


import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExTimer extends Observable implements Runnable {

    private Long lock;
    private boolean running;

    public ExTimer() {
        lock = new Long(0);
        running = true;
    }

    public void start() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        long k = 0;
        while (running) {
            k++;
            setChanged();
            notifyObservers("" + k);
            if (!running) {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ExTimer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ExTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Timpoul e:" + k + " milisecunde");
    }

    public void end() {
        running = false;
    }
}