package com.example.animalhabitat.controllers;

import com.example.animalhabitat.concrete.*;
import com.example.animalhabitat.interfaces.*;
import com.example.animalhabitat.models.animals.Animal;
import com.example.animalhabitat.models.animals.Fish;
import com.example.animalhabitat.models.habitat.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class MainController {
    private final List<Animal> animals = new ArrayList<>();
    private final List<Habitat<?>> habitats = new ArrayList<>();

    public MainController() throws HabitatFullException, IncompatibleHabitatException {
        animals.add(new TigerAnimal());
        animals.add(new WolfAnimal());
        animals.add(new TurtleAnimal());
        animals.add(new FoxAnimal());
        animals.add(new PikeFish());
        animals.add(new SharkFish());
        animals.add(new CrowBird());
        animals.add(new PenguinBird());
        animals.add(new OstrichBird());
        animals.add(new SparrowBird());
    }

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        model.put("habitats", habitats);
        return "index";
    }

    @GetMapping("/habitat")
    public String addHabitat(Map<String, Object> model) {
        return "habitat";
    }

    @GetMapping("/animal/{index}")
    public String addAnimalToHabitat(@PathVariable UUID index, Map<String, Object> model) {
        System.out.println(index);
        model.put("animals", animals);
        model.put("index", index);
        return "animal";
    }

    @PostMapping("/addAnimalToHabitat/{index}")
    public ModelAndView addToHabitat(@PathVariable UUID index, @RequestParam String animalType) throws HabitatFullException, IncompatibleHabitatException {
        Animal selectedAnimal = null;
        for (Animal animal: animals) {
            if(animal.getName().equals(animalType))
                selectedAnimal = animal;
        }
        System.out.println(selectedAnimal.getName());
        Habitat habitat = null;
        int arrayIndex = 0;
        for (Habitat<?> habit:habitats) {
            System.out.println(habit.getId().equals(index));
            if(habit.getId().equals(index))
                habitat = habit;
        }
        System.out.println(habitat);
        arrayIndex = habitats.indexOf(habitat);
        habitat.addAnimal(selectedAnimal);
        System.out.println(arrayIndex);
        System.out.println(habitat);
        habitats.set(arrayIndex, habitat);
        return new ModelAndView("redirect:/");
    }


    @PostMapping("/addHabitat")
    public ModelAndView addHabitat(@RequestParam String type, @RequestParam int size) {
        System.out.println(type);
        System.out.println(size);
        switch (type) {
            case "Cages only for tiger":
                habitats.add(new TigerCage(size, type));
                break;
            case "Cages only for wolf":
                habitats.add(new WolfCage(size, type));
                break;
            case "Cells for any flyable birds":
                habitats.add(new Cell<>(size, type));
                break;
            case "Aquarium for any fish":
                habitats.add(new FishAquarium(size, type));
                break;
            case "Aquariums only for turtles":
                habitats.add(new TurtleAquarium(size, type));
                break;
            case "Aquariums for any animals which lives in aquarium":
                Aquarium<? extends ISwimmable> aquarium = new Aquarium<>(size, type);
                habitats.add(aquarium);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return new ModelAndView("redirect:/");
    }
}