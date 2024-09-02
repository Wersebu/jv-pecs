package core.mate.academy.model;

public class Excavator extends Machine {
    private int shovelSize;

    public Excavator() {

    }

    public Excavator(String name, String color, Integer shovelSize) {
        super(name, color);
        this.shovelSize = shovelSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getShovelSize() {
        return shovelSize;
    }

    public void setShovelSize(int shovelSize) {
        this.shovelSize = shovelSize;
    }
}
