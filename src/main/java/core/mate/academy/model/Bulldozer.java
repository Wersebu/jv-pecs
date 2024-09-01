package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int fuelConsuptionPerHour;

    public Bulldozer() {
        this.fuelConsuptionPerHour = 40;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getFuelConsuptionPerHour() {
        return fuelConsuptionPerHour;
    }

    public void setFuelConsuptionPerHour(int fuelConsuptionPerHour) {
        this.fuelConsuptionPerHour = fuelConsuptionPerHour;
    }
}
