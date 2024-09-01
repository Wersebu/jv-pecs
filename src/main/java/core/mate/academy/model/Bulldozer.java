package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int fuelConsuptionPerHour;

    public Bulldozer() {
        this.fuelConsuptionPerHour = 40;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
