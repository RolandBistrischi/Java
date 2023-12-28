package isp.lab5.exercise4;

public class OrganizerApp implements Ticket {

    private TicketsManager ticketsManager;

    public void checkin(UserApp userApp) {
        int cod = userApp.viewTicket();
        boolean codValid = this.ticketsManager.validateTicket(cod);
        if (codValid)
            System.out.println("Codul este valid. Te rog intra.");
        else
            System.out.println("Codul nu este valid. STERGE-O DE AICI!");
    }


    @Override
    public String toString() {
        return "OrganizerApp{" +
                "ticketsManager=" + ticketsManager +
                '}';
    }

    @Override
    public void setTicket(TicketsManager ticketsManager) {
        this.ticketsManager = ticketsManager;
    }
}
