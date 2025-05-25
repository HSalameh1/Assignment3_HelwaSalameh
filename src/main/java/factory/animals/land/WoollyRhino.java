//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.land;
import factory.animals.LandAnimal;

/**
 * Concrete implementation of a Woolly Rhino (Cenozoic land animal)
 * Demonstrates the "charging" walking behavior
 */
public class WoollyRhino implements LandAnimal {
    @Override
    public String getName() {
        return "Woolly rhino";
    }

    @Override
    public String getWalking() {
        return "charging";
    }
}