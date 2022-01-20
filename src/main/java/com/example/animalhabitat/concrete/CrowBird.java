package com.example.animalhabitat.concrete;

import com.example.animalhabitat.models.animals.Bird;
import com.example.animalhabitat.interfaces.IFlyable;
import com.example.animalhabitat.interfaces.IWalkable;

public class CrowBird extends Bird implements IFlyable, IWalkable {
    public String getName(){
        return "Crow Bird";
    }
}
