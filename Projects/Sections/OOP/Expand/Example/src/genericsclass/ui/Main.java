package genericsclass.ui;

import genericsclass.model.*;

public class Main {
    public static void main(String[] args) {

        Truck<Animal> transHorses = new Truck<>(5)
                .add(new Animal("Poseidon", "Horse"))
                .add(new Animal("Zeus", "Horse"))
                .add(new Animal("Hares", "Horse"))
                .add(new Animal("Hades", "Horse"))
                .add(new Animal("Hercules", "Horse"));
        printTruck(transHorses);

        Truck<Machinery> transMachines = new Truck<>(3)
                .add(new Machinery("Bulldozer"))
                .add(new Machinery("Forklift"))
                .add(new Machinery("Drill"));
        printTruck(transMachines);

        Truck<Car> transCars = new Truck<>(3)
                .add(new Car("Toyota"))
                .add(new Car("Mitsubishi"))
                .add(new Car("Chevrolet"));
        printTruck(transCars);
    }

    public static <T> void printTruck(Truck<T> truck){
        for(T a: truck){
            if(a instanceof Animal) {
                System.out.println(((Animal)a).getName() + " type: " + ((Animal)a).getType());
            }
            else if(a instanceof Car){
                System.out.println(((Car)a).getBrand());
            } else if(a instanceof Machinery){
                System.out.println(((Machinery)a).getType());
            }
        }
    }
}
