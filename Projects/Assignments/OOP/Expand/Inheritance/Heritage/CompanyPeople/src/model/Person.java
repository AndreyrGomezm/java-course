package model;

public class Person {
    private final String taxNumber;
    private final String firstName;
    private final String lastName;
    private final String address;

    public Person(String taxNumber, String firstName, String lastName, String address) {
        this.taxNumber = taxNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "taxNumber=" + taxNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address;
    }

}
