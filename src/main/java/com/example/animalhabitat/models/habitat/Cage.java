package com.example.animalhabitat.models.habitat;

import com.example.animalhabitat.concrete.TigerAnimal;
import com.example.animalhabitat.interfaces.IWalkable;
import com.example.animalhabitat.models.animals.Animal;
import com.example.animalhabitat.models.animals.Bird;

import java.util.Arrays;

public class Cage<T extends IWalkable> extends Habitat<T> {

    public Cage(int size, String name) {
        super(size, name);
    }

    @Override
    public void addAnimal(T animal) throws HabitatFullException, IncompatibleHabitatException {
        if (animal instanceof Bird) {
            throw new IncompatibleHabitatException();
        }
        super.tryAdd(animal); // ?
    }

}
