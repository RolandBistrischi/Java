
package isp.lab3.exercise5;

public class Main {

    public static void main(String[] args) {

        String[] products = {"apa", "pita", "pateu", "cola", "pepsi", "Bake Rolls"};
        int[] prices = {5, 6, 7, 4, 4, 5};
        int[] stonks = {5, 6, 7, 4, 4, 5};
        VendingMachine vendingMachine = new VendingMachine(products, prices, stonks, 0);

        //vendingMachine.displayProducts();
        vendingMachine.insertCoin(50);

        //System.out.println(vendingMachine.selectProduct(3));
        //vendingMachine.displayCredit();
        //vendingMachine.userMenu();
        System.out.println(vendingMachine.getProducts());
    }
}
