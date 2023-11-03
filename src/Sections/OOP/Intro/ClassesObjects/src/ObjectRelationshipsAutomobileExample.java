public class ObjectRelationshipsAutomobileExample {
    public static void main(String[] args) {

        Person ownerSubaru = new Person("Lucy", "Martinez");
        Automobile subaru = new Automobile("Subaru", "Impreza");
        subaru.setMotor(new Motor(2, TypeMotor.BENZINE));
        subaru.setPond(new Pond());
        subaru.setColor(Color.WHITE);
        subaru.setType(Type.HATCHBACK);
        subaru.setOwner(ownerSubaru);
        // subaru.setWheels(wheelsSub);
        Wheel[] wheelsSub = new Wheel[100];
        for (int i = 0; i < wheelsSub.length; i++) {
            subaru.addWheels(new Wheel("Yokohama", 16, 7.5));
        }

        Person ownerMazda = new Person("Paco", "Rodriguez");
        Automobile mazda = new Automobile("Mazda", "BT-50", Color.RED, new Motor(3, TypeMotor.DIESEL));
        mazda.setType(Type.PICKUP);
        mazda.setPond(new Pond());
        mazda.setOwner(ownerMazda);
        // mazda.setWheels(wheelsMaz);
        Wheel[] wheelsMaz = new Wheel[5];
        for (int i = 0; i < wheelsMaz.length; i++) {
            mazda.addWheels(new Wheel("Michelin", 18, 10.5));
        }

        Person ownerNissan = new Person("Bea", "Gonzalez");
        Automobile nissan = new Automobile("Nissan", "Navara", Color.GREY,
                new Motor(4, TypeMotor.DIESEL), new Pond(50));
        nissan.setOwner(ownerNissan);
        nissan.setType(Type.PICKUP);
        nissan.addWheels(new Wheel("Pirelli", 20, 11.5))
                .addWheels(new Wheel("Pirelli", 20, 11.5))
                .addWheels(new Wheel("Pirelli", 20, 11.5))
                .addWheels(new Wheel("Pirelli", 20, 11.5))
                .addWheels(new Wheel("Pirelli", 20, 11.5));

        Wheel[] wheelsNis2 = new Wheel[5];
        for (int i = 0; i < wheelsNis2.length; i++) {
            wheelsNis2[i] = new Wheel("Pirelli", 20, 11.5);
        }

        Person ownerNissan2 = new Person("Lalo", "Mena");
        Automobile nissan2 = new Automobile("Nissan", "Navara", Color.GREY,
                new Motor(3.5, TypeMotor.BENZINE), new Pond(50), ownerNissan2, wheelsNis2);
        nissan2.setColor(Color.YELLOW);
        nissan2.setType(Type.PICKUP);
        Automobile.setPatentColor(Color.BlUE);

        Automobile auto = new Automobile();

        System.out.println(subaru.detail());
        System.out.println(mazda.detail());
        System.out.println(nissan.detail());
        System.out.println(nissan2.detail());

        /*
         * System.out.println("Owner subaru: " + subaru.getOwner());
         * System.out.println("Wheals subaru: ");
         * for (Wheel w : subaru.getWheels()) {
         * System.out.println(w.getMaker() + ", Ring: " + w.getRing() + ", Wide:" +
         * w.getWide());
         * }
         */
    }
}
