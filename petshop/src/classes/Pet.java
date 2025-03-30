package classes;

public class Pet {
    private String name;
    private String breed;
    private int age;
    private boolean isDirty = true;  

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

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
