public class Customer {
    private int customerId;
    private String name;
    private String phone;

    public Customer(int customerId, String name, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name + " | Phone: " + phone);
    }
}