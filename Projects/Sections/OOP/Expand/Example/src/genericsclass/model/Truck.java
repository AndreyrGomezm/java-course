package genericsclass.model;

import java.util.*;

public class Truck <T> implements Iterable<T> {

    private List<T> objects;
    private int max;

    public Truck(int max) {
        this.max = max;
        this.objects = new ArrayList<>();
    }

    public Truck add(T objects){
        if(this.objects.size() <= max) {
            this.objects.add(objects);
        } else {
            throw new RuntimeException("There's no more space.");
        }
        return this;
    }

    @Override
    public Iterator<T> iterator() {
        return this.objects.iterator();
    }
}
