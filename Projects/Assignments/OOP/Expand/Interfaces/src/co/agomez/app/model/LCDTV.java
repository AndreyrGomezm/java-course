package co.agomez.app.model;

public class LCDTV extends Electronic {

    private int inches;

    public LCDTV(int price, String manufacturer, int inches) {
        super(price, manufacturer);
        this.inches = inches;
    }

    @Override
    public double getSellingPrice() {
        return getPrice() * 0.8;
    }

    public int getInches() {
        return inches;
    }
}
