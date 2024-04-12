package fr.polytech.sim.transport;

/**
 * A wheel that can be used with different vehicle types.
 */
public class Wheel implements Mobile {
    private final Terrain terrain = Terrain.getInstance();
    private final Pushable push;


    /**
     * Constructor.
     *
     * @param push  the object providing push power.
     */
    public Wheel(Pushable push) {
        this.push = push;
    }

    @Override
    public double getVelocity() {
        if (this.push == null) {
            return 0;
        }
        return this.push.getPush() * this.terrain.getResistanceFactor();
    }
}
