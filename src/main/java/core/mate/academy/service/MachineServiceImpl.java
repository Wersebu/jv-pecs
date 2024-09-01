package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        MachineProducer<? extends T> producer;

        if (type == Bulldozer.class) {
            producer = (MachineProducer<? extends T>) new BulldozerProducer();
        } else if (type == Excavator.class) {
            producer = (MachineProducer<? extends T>) new ExcavatorProducer();
        } else if (type == Truck.class) {
            producer = (MachineProducer<? extends T>) new TruckProducer();
        } else {
            return new ArrayList<>();
        }

        return (List<Machine>) producer.get();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T element : machines) {
            element.doWork();
        }
    }
}
