package classes;

public class Pet {
    private final String name;
    private final String breed;
    private int age;
    private boolean isDirty = true;  

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

    public boolean getDirty() {
        return isDirty;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
