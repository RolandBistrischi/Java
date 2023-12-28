package isp.lab3.exercise6;

import java.util.Scanner;

public class VendingMachine {
    private static VendingMachine instance = null;

    private String[] products;
    private int[] prices;
    private int[] stock;
    private int credit;


    public VendingMachine(String[] products, int[] prices, int[] stock, int credit) {
        this.products = products;
        this.prices = prices;
        this.stock = stock;
        this.credit = 0;
    }

    public VendingMachine() {
        this.credit = 0;
    }

    public static VendingMachine getInstance() {
        if (instance == null) {
            synchronized (VendingMachine.class) {
                if (instance == null) {
                    instance = new VendingMachine();
                }
            }
        }
        return instance;
    }

    public void displayProducts() {
        System.out.println("Produse: ");
        for (int i = 0; i < products.length; i++)
            System.out.println((i + 1) + ". " + products[i] + ": " + prices[i] + " lei");
        // System.out.println('\n' + '\n');
    }

    public void insertCoin(int value) {
        credit += value;
    }

    public String selectProduct(int id) {
        id--;
        if (id < 0 || id > products.length || stock[id] == 0 || credit < prices[id])
            return "Eroare: Selecție invalidă sau credit insuficient.";
        stock[id]--;
        credit -= prices[id];
        return products[id];
    }

    public void displayCredit() {
        System.out.println("Credit: " + credit);
    }

    public void userMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selecteaza o optiune:");
            System.out.println("1. Afiseaza produsele:");
            System.out.println("2. Adauga bani");
            System.out.println("3. Selecteaza produs");
            System.out.println("4.Afiseaza creditul");
            System.out.println("5. Iesi");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.println("Introduceti valoarea:");
                    int ban = scanner.nextInt();
                    insertCoin(ban);
                    break;
                case 3:
                    System.out.println("Introduceti numarul produsului dorit:");
                    int index = scanner.nextInt();
                    String result = selectProduct(index);
                    System.out.println(result);
                    break;
                case 4:
                    displayCredit();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Alegere gresita");
            }
        }

    }
}