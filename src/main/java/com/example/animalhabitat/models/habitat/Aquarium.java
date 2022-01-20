package com.example.animalhabitat.models.habitat;

import com.example.animalhabitat.interfaces.ISwimmable;

public class Aquarium<T extends ISwimmable> extends Habitat<T> {
    public Aquarium(int size, String name) {
        super(size, name);
    }

    @Override
    public void addAnimal(T animal) throws HabitatFullException, IncompatibleHabitatException {
        super.tryAdd(animal); // ?
    }
}
