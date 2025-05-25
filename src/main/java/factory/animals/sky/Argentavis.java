//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.sky;

import factory.animals.SkyAnimal;

/**
 * Giant prehistoric bird from the Cenozoic era
 */
public class Argentavis implements SkyAnimal {
    @Override
    public String getName() {
        return "Argentavis";
    }

    @Override
    public String getFlying() {
        return "flapping";
    }
}