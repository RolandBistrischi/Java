package isp.lab5.exercise1;

public class Customer {

    private String customerld;
    private String name;
    private String phone;
    private Address address;

    public Customer(String customerld, String name, String phone, Address address) {
        this.customerld = customerld;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerld='" + customerld + '\'' + '\n' +
                "    name='" + name + '\'' + '\n' +
                "    phone='" + phone + '\'' + '\n' +
                "    address=" + address + '\n' +
                '}';
    }
}
