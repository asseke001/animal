package com.example.animalhabitat.models.animals;

import com.example.animalhabitat.interfaces.IMovable;
import com.example.animalhabitat.interfaces.IWalkable;

public abstract class Animal implements IMovable {
    @Override
    public int getComfortableSpace() {
        return 5;
    }
}
