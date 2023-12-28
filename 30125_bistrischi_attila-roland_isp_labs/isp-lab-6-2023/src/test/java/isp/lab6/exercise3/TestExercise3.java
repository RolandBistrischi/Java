package isp.lab6.exercise3;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class TestExercise3 {
    @Test
    public void testProductAdd() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product("zahar", (float) 2.69);
        Exercise3.productAdd(productList, product);
        assertTrue(productList.contains(product));
    }

    @Test
    public void testProductRemove() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product("zahar", (float) 2.69);
        Exercise3.productAdd(productList, product);
        Exercise3.productRemove(productList, product);
        assertFalse(productList.contains(product));
    }

    @Test
    public void testProductUpdate() {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("zahar", (float) 2.69);
        Product product2 = new Product("faina", (float) 4.50);
        Exercise3.productAdd(productList, product1);
        Exercise3.productUpdate(productList, product1, product2);
        //System.out.println(productList.get(0));
        assertEquals(1, productList.size());
        assertEquals(product2, productList.get(0));
    }

    @Test
    public void testGetProductName() {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("zahar", (float) 2.69);
        Product product2 = new Product("faina", (float) 4.50);
        Exercise3.productAdd(productList, product1);
        Exercise3.productAdd(productList, product2);
        assertEquals(product1, Exercise3.getProductName(productList, "zahar"));
        assertEquals(product2, Exercise3.getProductName(productList, "faina"));
        assertNull(Exercise3.getProductName(productList, "mandrine"));
    }

    @Test
    public void testAddToCart() {
        Map<Product, Integer> cart = new HashMap<>();
        Product product = new Product("zahar", (float) 2.69);
        ActiveSession activeSession = new ActiveSession("Roland", cart);
        Exercise3.addToCart(activeSession, product, 5);
        assertEquals(1, cart.size());
        assertEquals(5, cart.get(product), 0.1);
    }

    @Test
    public void testRemoveFromCart() {
        Map<Product, Integer> cart = new HashMap<>();
        Product product = new Product("zahar", (float) 2.69);
        cart.put(product, 10);
        ActiveSession activeSession = new ActiveSession("Roland", cart);
        Exercise3.removeFromCart(activeSession, product, 5);
        assertEquals(1, cart.size());
        assertEquals(5, cart.get(product), 0);
        Exercise3.removeFromCart(activeSession, product, 6);
        assertEquals(0, cart.size());
    }

    @Test
    public void testUserAdd() {
        Set<User> userSet = new HashSet<>();
        User user = new User("Roland", "123456789");
        Exercise3.userAdd(userSet, user);
        assertEquals(1, userSet.size());
        assertTrue(userSet.contains(user));
    }

    @Test
    public void testUserRemove() {
        Set<User> userSet = new HashSet<>();
        User user = new User("Roland", "123456789");
        Exercise3.userAdd(userSet, user);
        Exercise3.userRemove(userSet, user);
        assertEquals(0, userSet.size());
        assertFalse(userSet.contains(user));
    }

    @Test
    public void testUserLogin() {
        User user = new User("Roland", "123456789");
        Set<User> userSet = new HashSet<>();
        Map<Product, Integer> cart = new HashMap<>();
        Product product = new Product("zahar", (float) 2.69);
        cart.put(product, 10);
        userSet.add(user);

        OnlineStore onlineStore = new OnlineStore(new ArrayList<>(), new HashMap<>());
        LoginSystem loginSystem = new LoginSystem(userSet, onlineStore);

        ActiveSession activeSession = new ActiveSession(user.getUsername(), cart);
        assertEquals(activeSession.getUsername(), user.getUsername());
        assertTrue(loginSystem.getUsers().contains(user));
    }

    @Test
    public void testUserUpdate() {
        User user = new User("testuser", "testpassword");
        Set<User> userSet = new HashSet<>();
        userSet.add(user);

        User newUser = new User("newtestuser", "testpassword");

        Exercise3.userUpdate(userSet, user, newUser);
        assertTrue(userSet.contains(newUser));
        assertFalse(userSet.contains(user));
    }
}
