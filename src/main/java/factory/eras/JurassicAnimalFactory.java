//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.eras;

import factory.animals.LandAnimal;
import factory.animals.SeaAnimal;
import factory.animals.SkyAnimal;
import factory.animals.land.Stegosaurus;
import factory.animals.land.Tyrannosaurus;
import factory.animals.sea.Plesiosaurus;
import factory.animals.sky.Pterodactylus;

import java.util.List;

// Similar imports as Cenozoic
public abstract class JurassicAnimalFactory implements AnimalAbstractFactory {
    @Override
    public String getEra() { return "Jurassic"; }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return List.of(
                new Tyrannosaurus(),
                new Stegosaurus()
        );
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return List.of(
                new Plesiosaurus()
        );
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return List.of(
                new Pterodactylus() // Primary Jurassic flyer
        );
    }
}