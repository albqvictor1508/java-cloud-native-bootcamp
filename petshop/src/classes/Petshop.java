package classes;

import java.util.List;

public class Petshop {
    private List<Pet> pets;
    private int water = 30;
    private int shampoo = 10;
    private boolean isDirty = false;

    public void bathingPet() {
        if(this.isDirty == true) {
            System.out.println("Clear the machine to clear pets");
            return;
        }

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
        Pet pet = pets.remove(pets.size() - 1);
        if(pet.getDirty() == true) {
            System.out.println("The pet has been removed while it was dirty! now clean the machine");
            this.isDirty = true;
            return;
        }
        System.out.println("Pet removed!");
    }

    public void verifyWater() {
        System.out.println(this.water + "L of water in machine");
    }
    public void verifyShampoo() {
        System.out.println(this.shampoo + "L of shampoo in machine");
    }
    public void cleanMachine() {
        if(this.isDirty == false) {
            System.out.println("The machine is clean");
            return;
        }
        if(this.shampoo == 0) {
            System.out.println("add more shampoo to clean the machine");
        }
        if(this.water == 0) {
            System.out.println("add more watter to clean the machine");
        }
        this.shampoo -= 1;
        this.water -= 3;
        this.isDirty = false;
        System.out.println("The machine has been cleaned!");
    }
    public void addShampo(int shampoo) {
        if(shampoo >= 10) {
            System.out.println("The shampoo limit is 10L");
            return;
        }
        if(this.shampoo >= 10) {
            this.shampoo = 10;
            System.out.println("max amount of shampoo");
            return;
        }
        this.shampoo += shampoo;
        System.out.println("Shampoo added!");
    }

    public void addWater(int water) {
        if(water >= 10) {
            System.out.println("The water limit is 30L");
            return;
        }
        if(this.water >= 10) {
            this.water = 10;
            System.out.println("max amount of watter");
            return;
        }
        this.water += water;
        System.out.println("Watter added!");
    }
}