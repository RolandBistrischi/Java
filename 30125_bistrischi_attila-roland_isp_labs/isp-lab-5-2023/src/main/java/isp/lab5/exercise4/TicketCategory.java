package isp.lab5.exercise4;

public enum TicketCategory {
    RACE("F1"),
    SPORTS("Bascket");
    private String displayName;

    TicketCategory(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
