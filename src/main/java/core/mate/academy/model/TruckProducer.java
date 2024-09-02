package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truck = new ArrayList<>();

        truck.add(new Truck("HeavyHaul Pro XT", "Pink", 5000));
        truck.add(new Truck("MaxLoad 750", "Gray", 7000));
        truck.add(new Truck("GigaTransporter S4", "Yellow", 6500));

        return truck;
    }
}
