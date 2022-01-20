package com.example.animalhabitat.models.habitat;

import com.example.animalhabitat.concrete.TurtleAnimal;
import com.example.animalhabitat.interfaces.ISwimmable;

public class TurtleAquarium extends Aquarium {
    public TurtleAquarium(int size, String name) {
        super(size, name);
    }

    @Override
    public void addAnimal(ISwimmable animal) throws HabitatFullException, IncompatibleHabitatException {
        if (!(animal instanceof TurtleAnimal)) {
            throw new IncompatibleHabitatException();
        }
        super.addAnimal(animal);
    }
}
