package isp.lab6.exercise3;

import java.util.Set;

public class LoginSystem {
    private Set<User> users;
    private OnlineStore store;

    public LoginSystem(Set<User> users, OnlineStore store) {
        this.users = users;
        this.store = store;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public OnlineStore getStore() {
        return store;
    }

    public void setStore(OnlineStore store) {
        this.store = store;
    }

    public void register(String username, String password) {
        User user = new User(username, password);
        users.add(user);
        System.out.println(username + " a fost adaugat");
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Logare cu succes!");
                return true;
            }
        }
        System.out.println("Nume sau parola incorecte.");
        return false;
    }

    public boolean logout(String username) {
        System.out.println(username + " ai fost delogat");
        return true;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}
