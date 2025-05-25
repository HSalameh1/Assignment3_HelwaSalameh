//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.sky;

import factory.animals.SkyAnimal;

/**
 * Famous Jurassic flying reptile
 */
public class Pterodactylus implements SkyAnimal {
    @Override
    public String getName() {
        return "Pterodactylus";
    }

    @Override
    public String getFlying() {
        return "gliding";
    }
}