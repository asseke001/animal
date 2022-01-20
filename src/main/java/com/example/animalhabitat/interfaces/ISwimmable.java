package com.example.animalhabitat.interfaces;

public interface ISwimmable extends IMovable {
    default void swim() {
        System.out.println("Performing swim");
    }
}
