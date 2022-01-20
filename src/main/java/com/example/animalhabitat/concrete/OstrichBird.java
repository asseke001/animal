package com.example.animalhabitat.concrete;

import com.example.animalhabitat.models.animals.Bird;
import com.example.animalhabitat.interfaces.IWalkable;

public class OstrichBird extends Bird implements IWalkable {
    public String getName(){
        return "OstrichBird";
    }
}
