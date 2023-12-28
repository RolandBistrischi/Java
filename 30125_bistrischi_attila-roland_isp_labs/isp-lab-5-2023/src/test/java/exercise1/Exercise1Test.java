package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1Test {
    @Test

    public void TestExercise() {
        ProductCategory productCategory = ProductCategory.FOOD_AND_DRINK;
        Address address = new Address("Baritiu", "Cluj");
        Customer customer = new Customer("qwer", "Roli", "07832647324", address);
        Product product = new Product("aaa", "sare", 2.5, productCategory, customer);
        System.out.println(product.toString());

        assertEquals("Product{productld='aaa'\n" +
                " name='sare'\n" +
                " price=2.5\n" +
                " productCategory=Food & Drink\n" +
                " customer=Customer{customerld='qwer'\n" +
                "    name='Roli'\n" +
                "    phone='07832647324'\n" +
                "    address=Address{street='Baritiu', city='Cluj'}\n" +
                "}}", product.toString());
    }
}
