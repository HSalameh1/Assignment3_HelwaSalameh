//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.sea;

import factory.animals.SeaAnimal;

/**
 * Ancient shark species from the Cenozoic era
 */
public class Otodus implements SeaAnimal {
    @Override
    public String getName() {
        return "Otodus";
    }

    @Override
    public String getSwimming() {
        return "hunting";
    }
}