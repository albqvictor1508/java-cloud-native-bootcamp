package classes;

import java.util.List;

public class Petshop {
    private List<Pet> pets;
    private int water;
    private int shampoo;

    public void bathingPet() {
        if(pets.size() == 0) {
            System.out.println("The list of pets is empty");
        }
        Pet pet = pets.get(0);
        if(pet.getDirty() == true) {
            System.out.println("The pet is already clean");
            return;
        }
        pet.setDirty(false);
        System.out.println("The pet has been cleaned");
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + ", of the breed " + pet.getBreed() + " has been added to the pets list");
    }
    
}