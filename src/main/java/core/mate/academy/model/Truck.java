package core.mate.academy.model;

public class Truck extends Machine {
    private int maxCapacity;

    public Truck() {
        this.maxCapacity = 5000;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
