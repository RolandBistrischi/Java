package isp.lab5.exercise4;

import java.util.ArrayList;
import java.util.Random;

public class TicketsManager {
    private ArrayList<Integer> valideTickets = new ArrayList<Integer>();
    private TicketCategory ticketCategory;
    private Random random = new Random();

    public int generateTicket(int money) {
        int ticket = 0;
        if (money >= 20) {
            ticket = (int) (1000 * this.random.nextInt());
            this.valideTickets.add(new Integer(ticket));
        }
        return ticket;
    }

    public boolean validateTicket(int cod) {
        if (this.valideTickets.contains(new Integer(cod)))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "TicketsManager{" +
                "valideTickets=" + valideTickets +
                '}';
    }
}
