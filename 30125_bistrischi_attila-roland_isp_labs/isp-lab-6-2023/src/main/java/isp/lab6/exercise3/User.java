package isp.lab6.exercise3;

import java.util.Objects;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {

        if (password.length() > 8) {
            this.username = username;
            this.password = password;
            System.out.println("Acceptat");

        } else
            System.out.println("Parola slaba");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUsername().equals(user.getUsername()) && getPassword().equals(user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword());
    }
}
