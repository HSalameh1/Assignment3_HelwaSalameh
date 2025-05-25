//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.land;

import factory.animals.LandAnimal;

/**
 * Stegosaurus implementation (Jurassic herbivore)
 * Demonstrates "plodding" walking behavior
 */
public class Stegosaurus implements LandAnimal {
    @Override
    public String getName() {
        return "Stegosaurus";
    }

    @Override
    public String getWalking() {
        return "plodding";
    }
}