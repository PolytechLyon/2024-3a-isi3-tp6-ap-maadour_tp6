package fr.polytech.sim.transport;

import java.util.Random;

/**
 * Terrain features.
 */
public class Terrain {
    private final double resistanceFactor = new Random().nextDouble();
    private static Terrain instance = null;

    private Terrain() {
    }

    public static Terrain getInstance() {
        if(instance == null) {
            instance = new Terrain();
        }
        return instance;
    }

    public double getResistanceFactor() {
        return resistanceFactor;
    }
}
