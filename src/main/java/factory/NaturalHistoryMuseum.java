//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package factory;

import factory.animals.LandAnimal;
import factory.animals.SeaAnimal;
import factory.animals.SkyAnimal;
import factory.eras.AnimalAbstractFactory;
import factory.eras.CenozoicAnimalFactory;
import java.util.List;

public class NaturalHistoryMuseum {
    public static void main(String[] args) {
        // set up the exhibit
        AnimalAbstractFactory f = new CenozoicAnimalFactory();
        System.out.println("You are in the " + f.getEra() + " exhibition");
        System.out.println("===== " + f.getEra() + " land animals section =====");
        List<LandAnimal> landAnimals = f.createLandAnimals();
        for (LandAnimal a : landAnimals) {
            System.out.println("A " + a.getName() + " " + a.getWalking());
        }
        System.out.println("===== " + f.getEra() + " sea animals section =====");
        List<SeaAnimal> seaAnimals = f.createSeaAnimals();
        for (SeaAnimal a : seaAnimals) {
            System.out.println("A " + a.getName() + " " + a.getSwimming());
        }
        System.out.println("===== " + f.getEra() + " sky animals section =====");
        List<SkyAnimal> skyAnimals = f.createSkyAnimals();
        for (SkyAnimal a : skyAnimals) {
            System.out.println("A " + a.getName() + " " + a.getFlying());
        }
        System.out.println("Thank you for visiting the " + f.getEra() + " exhibition");
    }
}