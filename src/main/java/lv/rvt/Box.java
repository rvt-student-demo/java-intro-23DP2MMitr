package lv.rvt;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private double maxCapacity;
    private List<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable element) {
        if (currentWeight() + element.weight() <= maxCapacity) {
            items.add(element);
        }
    }

    public double currentWeight() {
        double totalWeight = 0;
        for (Packable element : items) {
            totalWeight += element.weight();
        }
        return totalWeight;
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + currentWeight() + " kg";
    }
}