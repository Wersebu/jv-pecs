package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> truck = new ArrayList<>();

        truck.add(new Truck());
        truck.add(new Truck());
        truck.add(new Truck());

        return truck;
    }
}
