package co.agomez.inheritance.app;

import co.agomez.inheritance.app.domain.*;

public class ExampleCompanyPeople {

    public static void main(String[] args) {
        Manager manager = new Manager(57000.00, 25, 2000.00, "12.345.678-9", "John", "Roe", "Agustinas 2233");
        manager.increaseCompensation(15);
        manager.setBudget(77000.00);
        System.out.println(manager);
    }

}
