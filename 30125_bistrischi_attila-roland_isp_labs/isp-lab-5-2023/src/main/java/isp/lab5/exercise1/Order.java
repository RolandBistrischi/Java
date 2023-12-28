package isp.lab5.exercise1;

import java.time.LocalDateTime;

public class Order {

    private String orderld;
    private LocalDateTime date;
    private Double totalPrice;
    private Product products;

    public Order(String orderld, LocalDateTime date, Double totalPrice, Product products) {
        this.date = date;
        this.orderld = orderld;
        this.totalPrice = totalPrice;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderld='" + orderld + '\'' +'\n'+
                ", date=" + date +'\n'+
                ", totalPrice=" + totalPrice +'\n'+
                ", product=" + products +
                '}';
    }
}
