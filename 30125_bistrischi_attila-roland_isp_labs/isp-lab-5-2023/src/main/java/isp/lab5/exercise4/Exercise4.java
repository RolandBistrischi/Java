package isp.lab4.exercise4;

import isp.lab5.exercise4.OrganizerApp;
import isp.lab5.exercise4.TicketsManager;
import isp.lab5.exercise4.UserApp;

public class Exercise4 {

    public static void main(String[] args) {
        TicketsManager ticketsManager = new TicketsManager();
        UserApp userApp = new UserApp();
        userApp.setTicket(ticketsManager);

        userApp.setMoney(100);
        userApp.buyTicket();

        OrganizerApp organizerApp = new OrganizerApp();
        organizerApp.setTicket(ticketsManager);

        //ticketsManager.generateTicket(200);
        organizerApp.checkin(userApp);
        System.out.println("bani: " + userApp.getMoney());

    }
}
