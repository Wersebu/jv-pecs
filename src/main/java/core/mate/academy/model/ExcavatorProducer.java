package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavator = new ArrayList<>();

        excavator.add(new Excavator("DigMaster 300", "Purple", 5));
        excavator.add(new Excavator("Excavator ZX7", "Cyan", 4));
        excavator.add(new Excavator("GroundBreaker X1", "Lime", 6));

        return excavator;
    }
}
