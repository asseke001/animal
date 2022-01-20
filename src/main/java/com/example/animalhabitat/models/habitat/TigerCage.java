package com.example.animalhabitat.models.habitat;

import com.example.animalhabitat.concrete.TigerAnimal;
import com.example.animalhabitat.interfaces.IWalkable;

public class TigerCage extends Cage {
    public TigerCage(int size, String name) {
        super(size, name);
    }

    @Override
    public void addAnimal(IWalkable animal) throws HabitatFullException, IncompatibleHabitatException {
        if (!(animal instanceof TigerAnimal)) {
            throw new IncompatibleHabitatException();
        }
        super.addAnimal(animal);
    }
}
