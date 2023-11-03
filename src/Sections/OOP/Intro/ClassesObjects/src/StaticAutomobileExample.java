public class StaticAutomobileExample {
    public static void main(String[] args) {

        Automobile.setStaticPondCapacity(45);
        Automobile subaru = new Automobile("Subaru", "Impreza");
        subaru.setMotor(new Motor(2, TypeMotor.BENZINE));
        subaru.setPond(new Pond());
        subaru.setColor(Color.WHITE);
        subaru.setType(Type.HATCHBACK);

        Automobile mazda = new Automobile("Mazda", "BT-50", Color.RED, new Motor(3, TypeMotor.DIESEL));
        mazda.setType(Type.PICKUP);
        // mazda.setPond(new Pond());

        Automobile nissan = new Automobile("Nissan", "Navara", Color.GREY,
                new Motor(4, TypeMotor.DIESEL), new Pond(50));
        nissan.setType(Type.PICKUP);

        Automobile nissan2 = new Automobile("Nissan", "Navara", Color.GREY,
                new Motor(3.5, TypeMotor.BENZINE), new Pond(50));
        nissan2.setColor(Color.YELLOW);
        nissan2.setType(Type.PICKUP);

        Automobile.setPatentColor(Color.BlUE);

        Automobile auto = new Automobile();

        System.out.println(subaru.detail());
        System.out.println(mazda.detail());
        System.out.println(nissan.detail());

        System.out.println(nissan2.detail());
        System.out.println("Automobile.getPatentColor() " + Automobile.getPatentColor());
        System.out.println("kilometers per liters = " + Automobile.calculateStaticConsumption(300, 60));
        System.out.println("Maximum road speed: " + Automobile.MAXIMUM_ROAD_SPEED);
        System.out.println("Maximum city speed: " + Automobile.MAXIMUM_CITY_SPEED);

        System.out.println(mazda.calculateConsumption(300, 70));
    }
}
