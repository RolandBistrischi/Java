
package isp.lab3.exercise4;

public class Main {

    public static void main(String[] args) {

        MyPoint myPoint1 = new MyPoint(1, 1, 1);
        MyPoint myPoint2 = new MyPoint(2, 2, 2);
        System.out.println("Distanta este: " + myPoint1.distance(myPoint2));
    }
}
