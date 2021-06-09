package Entities.Service;

import Entities.animal_entities.Animal;
import Entities.animal_entities.Carnivore;
import Entities.animal_entities.Herbivore;
import Entities.animal_entities.Omnivore;
import Entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNoteBook {


    private List<Carnivore> carnivore;
    private List<Omnivore> omnivore;
    private List<Herbivore> Herbivore;
    private int plantCount;
    private int amimalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNoteBook() {
    }

    public List<Carnivore> getCarnivore() {
        return carnivore;
    }

    public void setCarnivore(List<Carnivore> carnivore) {
        this.carnivore = carnivore;
    }

    public List<Omnivore> getOmnivore() {
        return omnivore;
    }

    public void setOmnivore(List<Omnivore> omnivore) {
        this.omnivore = omnivore;
    }

    public List<Entities.animal_entities.Herbivore> getHerbivore() {
        return Herbivore;
    }

    public void setHerbivore(List<Entities.animal_entities.Herbivore> herbivore) {
        Herbivore = herbivore;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAmimalCount() {
        return amimalCount;
    }

    public void addAnimal(Animal animal) {
       
        this.animals.forEach(a -> {
            if(a.getName().equals(animal.getName())) {
                return;

            }
        });
        this.animals.add(animal);
    }


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

