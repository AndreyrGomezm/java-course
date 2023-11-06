package model;

public class IPhone extends Electronic {

    private final String model;
    private final String color;

    public IPhone(int price, String manufacturer, String model, String color) {
        super(price, manufacturer);
        this.model = model;
        this.color = color;
    }

    @Override
    public double getSellingPrice() {
        return getPrice() * 0.9;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
