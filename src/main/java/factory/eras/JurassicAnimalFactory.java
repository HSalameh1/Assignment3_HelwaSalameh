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

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Concrete factory implementation for creating Jurassic period animals.
 * This factory produces prehistoric creatures that existed during the Jurassic era.
 */
public class JurassicAnimalFactory implements AnimalAbstractFactory {

    /**
     * @return The era name "Jurassic"
     */
    @Override
    public String getEra() {
        return "Jurassic";
    }

    /**
     * Creates land animals from the Jurassic period
     * @return Unmodifiable list of Jurassic land animals
     */
    @Override
    public List<LandAnimal> createLandAnimals() {
        return Collections.unmodifiableList(List.of(
                new Tyrannosaurus(),
                new Stegosaurus()
        ));
    }

    /**
     * Creates sea animals from the Jurassic period
     * @return Unmodifiable list of Jurassic sea animals
     */
    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Collections.unmodifiableList(List.of(
                new Plesiosaurus()
        ));
    }

    /**
     * Creates flying animals from the Jurassic period
     * @return Unmodifiable list of Jurassic flying animals
     */
    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Collections.unmodifiableList(List.of(
                new Pterodactylus()
        ));
    }

    /**
     * Factory method to create a Jurassic animal based on type
     * @param type The animal type (LAND, SEA, or SKY)
     * @return Created animal instance
     * @throws IllegalArgumentException if invalid type is provided
     */
    public Object createAnimal(AnimalType type) {
        Objects.requireNonNull(type, "Animal type cannot be null");

        return switch (type) {
            case LAND -> createLandAnimals();
            case SEA -> createSeaAnimals();
            case SKY -> createSkyAnimals();
            default -> throw new IllegalArgumentException("Unknown animal type: " + type);
        };
    }

    /**
     * Enum representing Jurassic animal types
     */
    public enum AnimalType {
        LAND, SEA, SKY
    }
}