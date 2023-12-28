package isp.lab3;

import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineTest {
    @Test
    public void TestdisplayProducts() {
        String[] products = {"apa", "pita", "pateu", "cola", "pepsi", "Bake Rolls"};
        int[] prices = {5, 6, 7, 4, 4, 5};
        int[] stonks = {5, 6, 7, 4, 4, 5};
        VendingMachine vendingMachine = new VendingMachine(products, prices, stonks, 0);
        //vendingMachine.displayProducts();
        vendingMachine.insertCoin(50);
        vendingMachine.displayProducts();

        /*assertEquals("Produse: \n" +
                "1. apa: 5 lei\n" +
                "2. pita: 6 lei\n" +
                "3. pateu: 7 lei\n" +
                "4. cola: 4 lei\n" +
                "5. pepsi: 4 lei\n" +
                "6. Bake Rolls: 5 lei", vendingMachine.displayProducts());*/

    }

    @Test
    public void TestinsertCoin() {
        String[] products = {"apa", "pita", "pateu", "cola", "pepsi", "Bake Rolls"};
        int[] prices = {5, 6, 7, 4, 4, 5};
        int[] stonks = {5, 6, 7, 4, 4, 5};
        VendingMachine vendingMachine = new VendingMachine(products, prices, stonks, 0);
        //vendingMachine.displayProducts();
        vendingMachine.insertCoin(50);
        assertEquals(50, vendingMachine.getCredit());

    }

    @Test
    public void TestselectProduct() {
        String[] products = {"apa", "pita", "pateu", "cola", "pepsi", "Bake Rolls"};
        int[] prices = {5, 6, 7, 4, 4, 5};
        int[] stonks = {5, 6, 7, 4, 4, 5};
        VendingMachine vendingMachine = new VendingMachine(products, prices, stonks, 0);
        //vendingMachine.displayProducts();
        vendingMachine.insertCoin(50);
        assertEquals("cola", vendingMachine.selectProduct(4));
        assertEquals("Bake Rolls", vendingMachine.selectProduct(6));
        assertEquals("Eroare: Selecție invalidă sau credit insuficient.", vendingMachine.selectProduct(100));
    }
}