//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.eras;

import factory.animals.LandAnimal;
import factory.animals.SeaAnimal;
import factory.animals.SkyAnimal;
import java.util.List;

public interface AnimalAbstractFactory {
    String getEra();
    List<LandAnimal> createLandAnimals();
    List<SeaAnimal> createSeaAnimals();
    List<SkyAnimal> createSkyAnimals();
}