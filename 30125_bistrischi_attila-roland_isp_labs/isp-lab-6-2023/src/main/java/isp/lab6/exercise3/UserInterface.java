package isp.lab6.exercise3;

import java.util.Objects;
import java.util.Scanner;

public class UserInterface {

    private LoginSystem loginSyst;
    private OnlineStore store;

    public UserInterface(LoginSystem loginSyst, OnlineStore store) {
        this.loginSyst = loginSyst;
        this.store = store;
    }

    public LoginSystem getLoginSyst() {
        return loginSyst;
    }

    public void setLoginSyst(LoginSystem loginSyst) {
        this.loginSyst = loginSyst;
    }

    public OnlineStore getStore() {
        return store;
    }

    public void setStore(OnlineStore store) {
        this.store = store;
    }

    public void loadInterface() {
        Scanner scanner = new Scanner(System.in);
        boolean ok = true;
        String username = null, password;
        while (ok) {
            System.out.println("Nume utilizator: ");
            username = scanner.nextLine();
            System.out.println("Parola: ");
            password = scanner.nextLine();
            if (loginSyst.login(username, password)) {
                System.out.println("Autentificare reusita!");
                ok = false;
            } else
                System.out.println("Autentificare esuata. Parola sau nume incorecte");
        }
        System.out.println("Produsele sunt:");
        for (Product product : store.getProducts()) {
            System.out.println(product.getName() + " - " + product.getPrice() + "lei");
        }

        while (true) {

            String produs;
            int quantity;
            System.out.println("Selectati produsul.");
            System.out.println("Produs:");
            produs = scanner.nextLine();
            System.out.println("Cantitatea:");
            quantity = scanner.nextInt();
            scanner.nextLine();

            Product product = null;
            for (Product product1 : store.getProducts())
                if (Objects.equals(product1.getName(), produs)) {
                    product = product1;
                }
            if (product == null)
                System.out.println("Nu avem produsul.");
            else {
                store.addToCart(username, product, quantity);
                System.out.println("Produsul s fost adaugat in cos");
                System.out.println("Adaugati si alte produse?");
                String mesaj = scanner.nextLine();
                if (mesaj.equalsIgnoreCase("nu"))
                    break;
            }
        }
        String mesajCumpar = store.checkout(username);
        System.out.println(mesajCumpar);
    }
}
