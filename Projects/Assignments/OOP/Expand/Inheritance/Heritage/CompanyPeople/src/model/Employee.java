package model;

public class Employee extends Person {
    private final int employeeId;
    private double compensation;

    public Employee(int employeeId, double compensation, String taxNumber, String firstName, String lastName,
                    String address) {
        super(taxNumber, firstName, lastName, address);
        this.employeeId = employeeId;
        this.compensation = compensation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getCompensation() {
        return compensation;
    }

    public void increaseCompensation(int percentage) {
        this.compensation += compensation * percentage / 100;
    }

    @Override
    public String toString() {
        return "employeeId=" + employeeId + ", compensation=" + compensation + ", " + super.toString();
    }
}
