package Entities.Service;

import Entities.animal_entities.Animal;
import Entities.animal_entities.Carnivore;
import Entities.animal_entities.Herbivore;
import Entities.animal_entities.Omnivore;
import Entities.plant_entities.Plant;
import jdk.internal.icu.text.UnicodeSet;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNoteBook {


    private int plantCount;
    private int animalCount;
    private List<Carnivore> carnivore;
    private List<Omnivore> omnivore;
    private List<Herbivore> herbivore;
    private List<Animal> animals;
    private List<Plant> plants;


    public ForestNoteBook() {
        plants = new ArrayList<>();
        animals = new ArrayList<>();
        omnivore = new ArrayList<>();
        carnivore = new ArrayList<>();
        herbivore = new ArrayList<>();
    }

    public List<Carnivore> getCarnivore() { return carnivore.stream().distinct().collect(Collectors.toList());}
    public List<Omnivore> getOmnivore() { return omnivore.stream().distinct().collect(Collectors.toList());}
    public List<Herbivore> getHerbivore() {return herbivore.stream().distinct().collect(Collectors.toList());}


    public void setCarnivore(List<Carnivore> carnivore) { this.carnivore = carnivore; }
    public void setOmnivore(List<Omnivore> omnivore) { this.omnivore = omnivore; }
    public void setHerbivore(List<Herbivore> herbivore) { this.herbivore = herbivore; }


    public int getPlantCount() {
        return plantCount;
    }
    public int getAmimalCount() {
        return amimalCount;
    }



    public void addAnimal(Animal animal) {
// check for duplicates

        this.animals.forEach(a -> {
            if(a.getName().equals(animal.getName())) {
                return;
            }
        });

// if no duplicates, add to main animals list
        this.animals.add(animal);

// determine what kind of animal it is and add to the proper list
        this.animals.forEach(a -> {
            if (animal is carnivore) {
        this.carnivores.add(animal);
        }
            else if (animal is herbivore) {
        this.herbivores.add(animal);
}
            else if (animal is omnivore) {
        this.omnivores.add(animal);
}

    });




    public void sortAnimalsByName() {

    }



    public void sortPlantsByName() {
        this.sortPlantsByName();
    }


    public void printNoteBook() {
            this.animals.forEach(animal -> {
                System.out.println(animal.toString());
            this.plants.forEach(plant -> {
                System.out.println(plant.toString());
            });
        });


    }
}

