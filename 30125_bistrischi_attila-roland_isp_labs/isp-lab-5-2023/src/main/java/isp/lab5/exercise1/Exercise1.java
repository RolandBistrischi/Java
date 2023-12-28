package isp.lab5.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        ProductCategory productCategory = ProductCategory.FOOD_AND_DRINK;
        Address address = new Address("Baritiu", "Cluj");
        Customer customer = new Customer("qwer", "Roli", "07832647324", address);
        Product product = new Product("aaa", "sare", 2.5, productCategory, customer);


        System.out.println(product.toString());
    }
}
