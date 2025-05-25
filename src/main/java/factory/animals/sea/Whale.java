//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.sea;

import factory.animals.SeaAnimal;

/**
 * Prehistoric whale from the Cenozoic era
 */
public class Whale implements SeaAnimal {
    @Override
    public String getName() {
        return "Ancient whale";
    }

    @Override
    public String getSwimming() {
        return "breaching";
    }
}