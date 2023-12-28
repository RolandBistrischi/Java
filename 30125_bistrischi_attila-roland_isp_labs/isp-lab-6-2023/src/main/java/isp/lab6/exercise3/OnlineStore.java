package isp.lab6.exercise3;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class OnlineStore {

    private List<Product> products;
    private Map<String, ActiveSession> sessions;

    public OnlineStore(List<Product> products, Map<String, ActiveSession> sessions) {
        this.products = products;
        this.sessions = sessions;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Map<String, ActiveSession> getSessions() {
        return sessions;
    }

    public void setSessions(Map<String, ActiveSession> sessions) {
        this.sessions = sessions;
    }


    public List<Product> getProductsSorted(Comparator<Product> sortCriteria) {
        products.sort(sortCriteria);
        return products;
    }

    public void addSession(String username) {
        sessions.put(username, new ActiveSession(username));
    }

    public void removeSession(String username) {
        sessions.remove(username);
    }

    public void addToCart(String username, Product product, int quantity) {
        ActiveSession session = sessions.get(username);
        if (session != null)
            session.addToCart(product, quantity);

    }

    public String checkout(String username) {
        ActiveSession session = sessions.get(username);
        if (session != null)
            return session.checkout();
        return null;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

}
