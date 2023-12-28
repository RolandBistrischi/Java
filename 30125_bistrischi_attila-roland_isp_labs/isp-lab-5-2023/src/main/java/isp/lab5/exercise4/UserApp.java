package isp.lab5.exercise4;

public class UserApp implements Ticket {
    private int codQR = 0;
    private int money = 100;

    private TicketsManager ticketsManager;

    @Override
    public void setTicket(TicketsManager ticketsManager) {
        this.ticketsManager = ticketsManager;
    }

    public void buyTicket() {
        if (money > 20) {
            this.codQR = this.ticketsManager.generateTicket(50);
            this.money = this.money - 20;
            System.out.println("User cumparat bilet cu codul " + this.codQR);
        }
    }

    public int viewTicket() {
        return this.codQR;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "UserApp{" +
                "codQR=" + codQR +
                ", money=" + money +
                ", ticketsManager=" + ticketsManager +
                '}';
    }
}
