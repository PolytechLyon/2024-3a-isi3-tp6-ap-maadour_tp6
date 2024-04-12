package fr.polytech.sim.transport;

import fr.polytech.sim.log.Logger;

import java.util.*;

/**
 * Vehicle abstraction.
 */
public abstract class Vehicle implements Mobile {

    private final Logger logger = Logger.createLogger("Vehicle");
    protected final List<Mobile> components = new ArrayList<>();

    /**
     * Force applied to push the vehicle.
     *
     * @return  push force.
     */
    public abstract double getPush();

    /**
     * Calculate and return vehicle's velocity based on individual velocities of
     * its components.
     *
     * @return vehicle speed
     */
    @Override
    public double getVelocity() {
        Iterator<Mobile> iterator = components.iterator();
        double sum = 0;
        int count = 0;
        double lastSpeed = 0;
        boolean inSync = true;
        while (iterator.hasNext()) {
            Mobile component = iterator.next();
            double speed = component.getVelocity();
            if (count != 0) {
                inSync &= speed == lastSpeed;
            }
            lastSpeed = speed;
            sum += speed;
            count++;
        }
        logger.log(inSync ? "Components are in sync" : "⚠ Components are out of sync. ⚠");
        return sum / count;
    }
}
