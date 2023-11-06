package app.model.entity;

public class PremiumClient extends Client implements Comparable<PremiumClient>{
    public PremiumClient(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public int compareTo(PremiumClient o) {
        return 0;
    }
}
