//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory.eras;

import factory.animals.LandAnimal;
import factory.animals.SeaAnimal;
import factory.animals.SkyAnimal;
import factory.animals.land.CaveLion;
import factory.animals.land.Mammoth;
import factory.animals.land.WoollyRhino;
import factory.animals.sea.Otodus;
import factory.animals.sea.Whale;
import factory.animals.sky.Argentavis;

import java.util.List;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    @Override
    public String getEra() {
        return "Cenozoic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return List.of(
                new Mammoth(),
                new CaveLion(),
                new WoollyRhino()
        );
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return List.of(
                new Otodus(),
                new Whale()
        );
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return List.of(
                new Argentavis()
        );
    }
}