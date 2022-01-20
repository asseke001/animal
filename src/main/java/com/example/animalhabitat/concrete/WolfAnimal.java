package com.example.animalhabitat.concrete;

import com.example.animalhabitat.models.animals.Animal;
import com.example.animalhabitat.interfaces.IWalkable;

public class WolfAnimal extends Animal implements IWalkable {
    public String getName(){
        return "WolfAnimal";
    }
}

