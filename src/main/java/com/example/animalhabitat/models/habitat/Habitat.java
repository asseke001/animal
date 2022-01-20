package com.example.animalhabitat.models.habitat;



import com.example.animalhabitat.concrete.TigerAnimal;
import com.example.animalhabitat.interfaces.IMovable;
import com.example.animalhabitat.models.animals.Animal;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public abstract class Habitat<T extends IMovable> {

    private final UUID id = UUID.randomUUID();
    private final int size;
    private final String name;
    private final List<T> animals;

    public Habitat(int size, String name) {
        this.size = size;
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void tryAdd(T animal) throws HabitatFullException {
        System.out.println(animal);
        if (animals.stream().mapToInt(IMovable::getComfortableSpace).sum() + animal.getComfortableSpace() > size) {
            throw new HabitatFullException();
        } else {
            animals.add(animal);
        }
    }

    public abstract void addAnimal(T animal) throws HabitatFullException, IncompatibleHabitatException;
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public UUID getId(){
        return id;
    }

    public List<T> getAnimals() {
        return animals;
    }
}
