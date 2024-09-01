package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavator = new ArrayList<>();

        excavator.add(new Excavator());
        excavator.add(new Excavator());
        excavator.add(new Excavator());

        return excavator;
    }
}
