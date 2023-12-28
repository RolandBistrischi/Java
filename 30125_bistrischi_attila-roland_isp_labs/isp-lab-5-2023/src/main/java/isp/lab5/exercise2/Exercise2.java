package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(54);
        SmartPhone smartPhone = new SmartPhone(20);
        SmartWach smartWach = new SmartWach(0);
        System.out.print("laptop:");
        laptop.charge(30);
        System.out.println(laptop.getBatteryLevel());

        smartWach.charge(10);
        System.out.print("wach:");
        System.out.println(smartWach.getBatteryLevel());

        smartPhone.charge(60);
        System.out.print("phone:");
        System.out.println(smartPhone.getBatteryLevel());
    }
}
