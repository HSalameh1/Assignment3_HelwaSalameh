//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

import factory.animals.LandAnimal;
import factory.animals.SeaAnimal;
import factory.animals.SkyAnimal;
import factory.eras.AnimalAbstractFactory;
import factory.eras.CenozoicAnimalFactory;
import factory.eras.JurassicAnimalFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryPatternTest {

    @Test
    public void testJurassicFactory() {
        AnimalAbstractFactory factory = new JurassicAnimalFactory();
        assertEquals("Jurassic", factory.getEra());

        // Test land animals - note the order is now Tyrannosaurus first
        List<LandAnimal> landAnimals = factory.createLandAnimals();
        assertEquals(2, landAnimals.size());
        assertEquals("Tyrannosaurus", landAnimals.get(0).getName());
        assertEquals("Stegosaurus", landAnimals.get(1).getName());

        // Rest of the test remains the same
        List<SeaAnimal> seaAnimals = factory.createSeaAnimals();
        assertEquals(1, seaAnimals.size());
        assertEquals("Plesiosaurus", seaAnimals.get(0).getName());

        List<SkyAnimal> skyAnimals = factory.createSkyAnimals();
        assertEquals(1, skyAnimals.size());
        assertEquals("Pterodactylus", skyAnimals.get(0).getName());
    }

    @Test
    public void testCenozoicFactory() {
        AnimalAbstractFactory factory = new CenozoicAnimalFactory();
        assertEquals("Cenozoic", factory.getEra());

        List<SeaAnimal> seaAnimals = factory.createSeaAnimals();
        assertEquals(2, seaAnimals.size());
        assertEquals("Whale", seaAnimals.get(1).getName());

        // Rest of the test remains the same
        List<LandAnimal> landAnimals = factory.createLandAnimals();
        boolean hasMammoth = landAnimals.stream()
                .anyMatch(a -> a.getName().equals("Mammoth"));
        assertTrue(hasMammoth);
    }
}