//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.animals.sea;

import factory.animals.SeaAnimal;

/**
 * Jurassic period marine reptile
 */
public class Plesiosaurus implements SeaAnimal {
    @Override
    public String getName() {
        return "Plesiosaurus";
    }

    @Override
    public String getSwimming() {
        return "gliding";
    }
}