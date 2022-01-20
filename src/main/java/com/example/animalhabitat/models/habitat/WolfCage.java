package com.example.animalhabitat.models.habitat;

import com.example.animalhabitat.concrete.WolfAnimal;
import com.example.animalhabitat.interfaces.IWalkable;

public class WolfCage extends Cage {
    public WolfCage(int size, String name) {
        super(size, name);
    }

    @Override
    public void addAnimal(IWalkable animal) throws HabitatFullException, IncompatibleHabitatException {
        if (!(animal instanceof WolfAnimal)) {
            throw new IncompatibleHabitatException();
        }
        super.addAnimal(animal);
    }
}
