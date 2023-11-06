package model;

public class Customer {
    private final String Name;
    private final String lastName;

    public Customer(String Name, String lastName) {
        this.Name = Name;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return Name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return Name + " " + lastName;
    }
}
