package com.example.animalhabitat.models.habitat;

import com.example.animalhabitat.interfaces.IFlyable;

public class Cell<T extends IFlyable> extends Habitat<T> {
    public Cell(int size, String name) {
        super(size, name);
    }

    @Override
    public void addAnimal(T animal) throws HabitatFullException {
        super.tryAdd(animal); // ?
    }
}
