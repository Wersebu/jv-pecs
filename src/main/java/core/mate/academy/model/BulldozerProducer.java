package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozer = new ArrayList<>();

        bulldozer.add(new Bulldozer("TitanForce 900", "Black", 52));
        bulldozer.add(new Bulldozer("EarthMover X5", "Red", 55));
        bulldozer.add(new Bulldozer("TerraMaster 5000", "Orange", 70));

        return bulldozer;
    }
}
