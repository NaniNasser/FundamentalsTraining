package Entities.Service;

import Entities.animal_entities.Animal;
import Entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForestBookApp {
    public static void main(String[] args) {



       Animal dog = new Animal("Dog");
       Animal wolf = new Animal("wolf");
       Animal tiger = new Animal("tiger");
       Animal lion = new Animal("lion");
       Animal elephant = new Animal("elephant");


       ForestNoteBook forestNoteBook = new ForestNoteBook();
       forestNoteBook.addAnimal(dog);
        forestNoteBook.addAnimal(wolf);
        forestNoteBook.addAnimal(tiger);
        forestNoteBook.addAnimal(lion);
        forestNoteBook.addAnimal(elephant);





    }
}



