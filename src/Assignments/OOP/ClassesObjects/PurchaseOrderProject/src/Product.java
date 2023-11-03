public class Product {

    private String manufacturer;
    private String name;
    private int price;

    public Product(String manufacturer, String name, int price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
