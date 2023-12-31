package model;

public class Customer extends Person {
    private final int customerId;

    public Customer(int customerId, String taxNumber, String firstName, String lastName, String address) {
        super(taxNumber, firstName, lastName, address);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "customerId=" + customerId + ", " + super.toString();
    }
}
