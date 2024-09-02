package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int fuelConsuptionPerHour;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, Integer fuelConsuptionPerHour) {
        super(name, color);
        this.fuelConsuptionPerHour = fuelConsuptionPerHour;
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
