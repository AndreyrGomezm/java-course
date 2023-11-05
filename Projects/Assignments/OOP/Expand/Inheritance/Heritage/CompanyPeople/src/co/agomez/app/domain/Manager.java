package co.agomez.model.app.domain;

public class Manager extends Employee {
    private double budget;

    public Manager(double budget, int employeeId, double compensation, String taxNumber, String firstName, String lastName, String address) {
        super(employeeId, compensation, taxNumber, firstName, lastName, address);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "budget=" + budget + ", " + super.toString();
    }
}
