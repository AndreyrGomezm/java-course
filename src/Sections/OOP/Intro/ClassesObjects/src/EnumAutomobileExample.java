public class EnumAutomobileExample {
    public static void main(String[] args) {

        Automobile.setStaticPondCapacity(45);
        Automobile subaru = new Automobile("Subaru", "Impreza");
        subaru.setMotor(new Motor(2, TypeMotor.BENZINE));
        subaru.setPond(new Pond());
        subaru.setColor(Color.WHITE);
        subaru.setType(Type.HATCHBACK);

        Type type = subaru.getType();
        System.out.println("Type subaru" + type.getName());
        System.out.println("Type desc. subaru: " + type.getDescription());

        Automobile mazda = new Automobile("Mazda", "BT-50", Color.RED, new Motor(3, TypeMotor.DIESEL));
        mazda.setPond(new Pond(45));
        mazda.setType(Type.PICKUP);

        type = mazda.getType();
        switch (type) {
            case CONVERTIBLE ->
                System.out.println("It's a two-door convertible sports car.");
            case COUPE ->
                System.out.println("It's a small, two-door, typically sporty car.");
            case VAN ->
                System.out.println("It's a utility car for transportation, business.");
            case HATCHBACK ->
                System.out.println("It's a compact midsize car, sporty appearance.");
            case PICKUP ->
                System.out.println("It's a double cabin car or truck.");
            case SEDAN ->
                System.out.println("It's a midsize car.");
            case STATION_WAGON ->
                System.out.println("It's a bigger car, with a big suitcase.");
        }

        Type[] types = Type.values();
        for (Type ta : types) {
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getName() + ", " +
                    ta.getDescription() + ", " +
                    ta.getDoorNum());
            System.out.println();
        }
    }
}
