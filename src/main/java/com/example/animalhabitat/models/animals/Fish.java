package com.example.animalhabitat.models.animals;

import com.example.animalhabitat.interfaces.IWaterHabitant;
import com.example.animalhabitat.models.animals.Animal;

public abstract class Fish extends Animal implements IWaterHabitant {
    @Override
    public int getComfortableSpace() {
        return 3;
    }
}
