package isp.lab5.exercise1;

public class Product {

    private String productld;
    private String name;
    private double price;
    private ProductCategory productCategory;
    private Customer customer;


    public Product(String productld, String name, double price, ProductCategory productCategory, Customer customer) {
        this.productld = productld;
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productld='" + productld + '\'' +'\n'+
                " name='" + name + '\'' +'\n'+
                " price=" + price +'\n'+
                " productCategory=" + productCategory +'\n'+
                " customer=" + customer +
                '}';
    }
}
