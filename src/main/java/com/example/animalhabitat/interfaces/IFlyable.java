package com.example.animalhabitat.interfaces;

public interface IFlyable extends IMovable {
    default void fly() {
        System.out.println("Performing fly");
    }
}
