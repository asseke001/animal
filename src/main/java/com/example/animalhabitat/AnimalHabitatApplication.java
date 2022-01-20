package com.example.animalhabitat;

import com.example.animalhabitat.concrete.TigerAnimal;
import com.example.animalhabitat.concrete.WolfAnimal;
import com.example.animalhabitat.interfaces.IMovable;
import com.example.animalhabitat.interfaces.IWalkable;
import com.example.animalhabitat.models.animals.Animal;
import com.example.animalhabitat.models.habitat.Cage;
import com.example.animalhabitat.models.habitat.Habitat;
import com.example.animalhabitat.models.habitat.HabitatFullException;
import com.example.animalhabitat.models.habitat.IncompatibleHabitatException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AnimalHabitatApplication extends SpringBootServletInitializer {

    public static void main(String[] args) throws HabitatFullException, IncompatibleHabitatException {
        SpringApplication.run(AnimalHabitatApplication.class, args);

    }

}
