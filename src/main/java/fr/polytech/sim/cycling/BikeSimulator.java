package fr.polytech.sim.cycling;

import fr.polytech.sim.Simulation;
import fr.polytech.sim.log.Logger;
import fr.polytech.sim.utils.Context;

import java.util.Iterator;

/**
 * Bike simulation.
 */
public class BikeSimulator implements Simulation {
    private final Logger logger = Logger.createLogger("BikeSimulator");

    public void run() {
        Iterator it = Context.injectAll(Bike.class);

        while (it.hasNext()) {
            Bike bike = (Bike) it.next();
            if ( bike instanceof TagAlongBike ) {
                this.logger.log("Création d'un velo TagAlongBike");
            } else {
                this.logger.log("Création d'un velo seulement Bike");
            }
            this.logger.log("Bike's speed : " +  Math.round(bike.getVelocity()) + " Km/h.");
        }

    }
}
