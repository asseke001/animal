package com.example.animalhabitat.models.habitat;

import com.example.animalhabitat.interfaces.ISwimmable;
import com.example.animalhabitat.interfaces.IWaterHabitant;
import com.example.animalhabitat.models.animals.Fish;

public class FishAquarium extends Aquarium {
    public FishAquarium(int size, String name) {
        super(size, name);
    }

    @Override
    public void addAnimal(ISwimmable animal) throws HabitatFullException, IncompatibleHabitatException {
        if(! (animal instanceof Fish)) {
            throw new IncompatibleHabitatException();
        }
        super.addAnimal(animal);
    }
}
