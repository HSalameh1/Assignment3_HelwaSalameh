//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.land;
import factory.animals.LandAnimal;

/**
 * Concrete implementation of a Mammoth (Cenozoic land animal)
 * Demonstrates the "stomping" walking behavior
 */
public class Mammoth implements LandAnimal {
    @Override
    public String getName() {
        return "Mammoth";
    }

    @Override
    public String getWalking() {
        return "stomping";
    }
}