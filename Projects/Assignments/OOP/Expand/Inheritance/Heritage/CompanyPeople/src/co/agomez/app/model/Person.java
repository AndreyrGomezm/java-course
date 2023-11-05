package co.agomez.model.app.domain;

public class Person {
    private String taxNumber;
    private String firstName;
    private String lastName;
    private String address;

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
