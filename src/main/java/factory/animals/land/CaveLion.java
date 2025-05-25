//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.land;
import factory.animals.LandAnimal;

/**
 * Concrete implementation of a Cave Lion (Cenozoic land animal)
 * Demonstrates the "prowling" walking behavior
 */
public class CaveLion implements LandAnimal {
    @Override
    public String getName() {
        return "Cave lion";
    }

    @Override
    public String getWalking() {
        return "walking";
    }
}