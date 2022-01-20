package com.example.animalhabitat.models.animals;

import com.example.animalhabitat.models.animals.Animal;

public abstract class Bird extends Animal {
    @Override
    public int getComfortableSpace() {
        return 4;
    }
}
