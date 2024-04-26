package fr.polytech.sim.cycling;

import fr.polytech.sim.transport.Pushable;
import fr.polytech.sim.transport.Vehicle;
import fr.polytech.sim.transport.Wheel;

public class Bike extends Vehicle implements Pushable {

    public Bike() {
        components.add(new Wheel(this));
        components.add(new Wheel(this));
    }

    @Override
    public double getPush() {
        return 25.0;
    }
}
