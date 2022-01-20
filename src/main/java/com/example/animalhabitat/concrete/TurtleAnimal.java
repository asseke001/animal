package com.example.animalhabitat.concrete;

import com.example.animalhabitat.models.animals.Animal;
import com.example.animalhabitat.interfaces.IWalkable;
import com.example.animalhabitat.interfaces.IWaterHabitant;

public class TurtleAnimal extends Animal implements IWaterHabitant, IWalkable {
    public String getName(){
        return "TurtleAnimal";
    }
}
