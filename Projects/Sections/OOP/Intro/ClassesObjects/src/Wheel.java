public class Wheel {
    private final String maker;
    private final int ring;
    private final double wide;

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
