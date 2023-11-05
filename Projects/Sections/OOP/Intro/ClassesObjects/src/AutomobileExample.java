import java.util.Date;

public class AutomobileExample {
    public static void main(String[] args) {

        Motor motorSubaru = new Motor(2, TypeMotor.BENZINE);
        Automobile subaru = new Automobile("Subaru", "Impreza");
        subaru.setMotor(motorSubaru);
        subaru.setPond(new Pond());
        subaru.setColor(Color.WHITE);

        Motor motorMazda = new Motor(3, TypeMotor.DIESEL);
        Automobile mazda = new Automobile("Mazda", "BT-50", Color.RED, motorMazda);
        mazda.setPond(new Pond(45));

        Automobile nissan = new Automobile("Nissan", "Navara", Color.GREY,
                new Motor(4, TypeMotor.DIESEL), new Pond(50));

        Automobile nissan2 = new Automobile("Nissan", "Navara", Color.GREY,
                new Motor(3.5, TypeMotor.BENZINE), new Pond(50));

        Automobile auto = new Automobile();

        Date date = new Date();
        System.out.println("They are equal? " + (nissan == nissan2));
        System.out.println("They are equal with equals? " + (nissan.equals(nissan2)));
        System.out.println("\n" + auto.equals(date));
        System.out.println("\n" + subaru.detail());
        System.out.println(subaru.speedUp(3000));
        System.out.println(subaru.curb());
        System.out.println("kilometers per liter " + subaru.calculateConsumption(300, 0.6));

        System.out.println("\n" + mazda.detail());
        System.out.println(mazda.accelerateCurb(4000));
        System.out.println("kilometers per liter " + mazda.calculateConsumption(300, 60));

        System.out.println("\n" + nissan.detail());
        System.out.println("kilometers per liter " + nissan.calculateConsumption(300, 60));
    }
}
