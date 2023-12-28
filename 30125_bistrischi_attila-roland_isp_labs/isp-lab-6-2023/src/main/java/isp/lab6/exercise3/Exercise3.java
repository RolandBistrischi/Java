package isp.lab6.exercise3;

import java.awt.peer.ListPeer;
import java.util.*;

public class Exercise3 {

    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        List<Product> productList = new ArrayList<>();
        Map<Product, Integer> cart = new HashMap<>();
        Map<String, ActiveSession> stringActiveSessionMap = new HashMap<>();

        User user = new User("Roland", "123456789");
        Product product = new Product("zahar", (float) 2.69);
        productAdd(productList, product);
        productAdd(productList, new Product("mandarine", (float) 30));
        cart.put(productList.get(1), 5);
        cart.put(productList.get(0), 2);

        ActiveSession activeSession = new ActiveSession(user.getUsername(), cart);
        stringActiveSessionMap.put(user.getUsername(), activeSession);
        OnlineStore onlineStore = new OnlineStore(productList, stringActiveSessionMap);

        userAdd(userSet, user);
        LoginSystem loginSystem = new LoginSystem(userSet, onlineStore);
        UserInterface userInterface = new UserInterface(loginSystem, onlineStore);
        userLogin(loginSystem, user);

        userInterface.loadInterface();
    }

    public static void productAdd(List<Product> productList, Product product) {
        productList.add(product);
    }

    public static void productRemove(List<Product> productList, Product product) {
        productList.remove(product);
    }

    public static void productUpdate(List<Product> productList, Product product1, Product newProduct) {
        for (Product product : productList) {
            if (product.getName().equals(product1.getName())) {
                productList.remove(product);
                productList.add(newProduct);
                break;
            }
        }
    }

    public static Product getProductName(List<Product> productList, String name) {
        for (Product product : productList)
            if (product.getName().equals(name)) {
                return product;
            }
        return null;
    }

    public static void addToCart(ActiveSession activeSession, Product product, int quantity) {
        activeSession.addToCart(product, quantity);
    }

    public static void removeFromCart(ActiveSession activeSession, Product product, int quantity) {
        Map<Product, Integer> cart = activeSession.getShoppingCart();
        if (cart.containsKey(product)) {
            int cantitate = cart.get(product);
            if (quantity >= cantitate)
                cart.remove(product);
            else cart.put(product, cantitate - quantity);
        }
    }

    public static void userLogin(LoginSystem loginSystem, User user) {
        loginSystem.login(user.getUsername(), user.getPassword());
    }

    public static void userAdd(Set<User> users, User user) {
        users.add(user);
    }

    public static void userRemove(Set<User> users, User user) {
        users.remove(user);
    }

    public static void userUpdate(Set<User> users,User user1, User newUser) {
        for (User user : users) {
            if (user.getUsername().equals(user1.getUsername())) {
                users.remove(user1);
                users.add(newUser);
                break;
            }
        }
    }
}


















