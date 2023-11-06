package model;

abstract public class Electronic extends Product implements IElectronic {

    private final String manufacturer;

    public Electronic(int price, String manufacturer) {
        super(price);
        this.manufacturer = manufacturer;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }
}
