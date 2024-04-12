package fr.polytech.sim.cycling;


public class TagAlongBike extends Bike {

    public TagAlongBike(Bike childBike) {
        super();
        components.add(childBike);
    }

    public TagAlongBike() {
        super();
        components.add(new Bike());
    }

    @Override
    public double getPush() {
        return 0;
    }


}
