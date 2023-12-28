package isp.lab6.exercise3;

import java.util.Map;

public class ActiveSession {

    private String username;
    private Map<Product, Integer> shoppingCart;

    public ActiveSession(String username, Map<Product, Integer> shoppingCart) {
        this.username = username;
        this.shoppingCart = shoppingCart;
    }

    public ActiveSession(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<Product, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    public void addToCart(Product product, int quantity) {
        if (shoppingCart.containsKey(product)) {
            int exist = shoppingCart.get(product);
            shoppingCart.put(product, exist + quantity);
        } else shoppingCart.put(product, quantity);
    }

    public String checkout() {
        float total = 0;
        for (Product product : shoppingCart.keySet()) {
            int quantity = shoppingCart.get(product);
            total = total + product.getPrice() * quantity;
        }
        shoppingCart.clear();
        return "Teanzactie reusita. Suma este: " + total;
    }
}
