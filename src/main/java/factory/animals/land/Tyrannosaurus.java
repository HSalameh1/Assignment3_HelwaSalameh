//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.land;

import factory.animals.LandAnimal;

/**
 * Tyrannosaurus rex implementation (Jurassic land predator)
 * Demonstrates "stalking" walking behavior
 */
public class Tyrannosaurus implements LandAnimal {
    @Override
    public String getName() {
        return "Tyrannosaurus";
    }

    @Override
    public String getWalking() {
        return "stalking";
    }
}