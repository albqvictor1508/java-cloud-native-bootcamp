package classes;

import java.util.List;

public class Petshop {
    private List<Pet> pets;
    private int water = 30;
    private int shampoo = 10;

    public void bathingPet() {
        if(pets.size() == 0) {
            System.out.println("The list of pets is empty");
        }
        Pet pet = pets.get(0);
        if(pet.getDirty() == true) {
            System.out.println("The pet is already clean");
            return;
        }
        this.shampoo -= 2;
        this.water -= 10;
        pet.setDirty(false);
        System.out.println("The pet has been cleaned");
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + ", of the breed " + pet.getBreed() + " has been added to the pets list");
    }
    
    public void removePet() {
        if(pets.size() == 0) {
            System.out.println("The list of pets is empty");
            return;
        }
        pets.remove(pets.size() - 1);
    }

    public void verifyWater() {
        System.out.println(this.water + "L of water in machine");
    }
    public void verifyShampoo() {
        System.out.println(this.shampoo + "L of shampoo in machine");
    }
}