import java.util.Arrays;

public class ArrayAutomobileExample {
    public static void main(String[] args) {

        Person ownerSubaru = new Person("Lucy", "Martinez");
        Automobile subaru = new Automobile("Subaru", "Impreza");
        subaru.setMotor(new Motor(2, TypeMotor.BENZINE));
        subaru.setPond(new Pond());
        subaru.setColor(Color.WHITE);
        subaru.setType(Type.HATCHBACK);
        subaru.setOwner(ownerSubaru);

        Person ownerMazda = new Person("Paco", "Rodriguez");
        Automobile mazda = new Automobile("Mazda", "BT-50", Color.RED, new Motor(3, TypeMotor.DIESEL));
        mazda.setType(Type.PICKUP);
        mazda.setPond(new Pond());
        mazda.setOwner(ownerMazda);

        Person ownerNissan = new Person("Bea", "Gonzalez");
        Automobile nissan = new Automobile("Nissan", "Navara", Color.GREY,
                new Motor(4, TypeMotor.DIESEL), new Pond(50));
        nissan.setOwner(ownerNissan);
        nissan.setType(Type.PICKUP);

        Person ownerSuzuki = new Person("Lalo", "Mena");
        Automobile suzuki = new Automobile("Suzuki", "Vitara", Color.GREY,
                new Motor(1.6, TypeMotor.BENZINE), new Pond(50));
        suzuki.setOwner(ownerSuzuki);
        suzuki.setColor(Color.YELLOW);
        suzuki.setType(Type.SUV);
        Automobile.setPatentColor(Color.BlUE);

        Automobile audi = new Automobile("Audi", "A3");
        audi.setOwner(new Person("Jan", "Perez"));

        Automobile[] cars = new Automobile[5];
        cars[0] = subaru;
        cars[1] = mazda;
        cars[2] = nissan;
        cars[3] = suzuki;
        cars[4] = audi;

        Arrays.sort(cars);
        for (Automobile car : cars) {
            System.out.println(car);
        }
    }
}

