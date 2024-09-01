package core.mate.academy.model;

public class Excavator extends Machine {
    private int shovelSize;

    public Excavator() {
        this.shovelSize = 10;
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
