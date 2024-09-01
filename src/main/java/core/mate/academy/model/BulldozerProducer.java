package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozer = new ArrayList<>();

        bulldozer.add(new Bulldozer());
        bulldozer.add(new Bulldozer());
        bulldozer.add(new Bulldozer());

        return bulldozer;
    }
}
