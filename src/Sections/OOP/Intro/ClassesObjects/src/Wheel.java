public class Wheel {
    private String maker;
    private int ring;
    private double wide;

    public Wheel(String maker, int ring, double wide) {
        this.maker = maker;
        this.ring = ring;
        this.wide = wide;
    }

    public String getMaker() {
        return maker;
    }

    public int getRing() {
        return ring;
    }

    public double getWide() {
        return wide;
    }
}
