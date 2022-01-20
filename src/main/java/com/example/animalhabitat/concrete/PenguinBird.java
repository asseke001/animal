package com.example.animalhabitat.concrete;

import com.example.animalhabitat.models.animals.Bird;
import com.example.animalhabitat.interfaces.ISwimmable;
import com.example.animalhabitat.interfaces.IWalkable;

public class PenguinBird extends Bird implements ISwimmable, IWalkable {
    public String getName(){
        return "PenguinBird";
    }
}
