package com.example.animalhabitat.interfaces;

public interface IWalkable extends IMovable {
    default void walk() {
        System.out.println("Performing walk");
    }
}
