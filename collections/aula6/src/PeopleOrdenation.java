import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeopleOrdenation {
    private List<Person> people;

    public PeopleOrdenation() {
        this.people = new ArrayList<>();
    }

    public void addNewPerson(Person person) {
        this.people.add(person);
    }

    public void sortByAge() {
        List<Person> peopleByAge = new ArrayList<>(people);
        Collections.sort(peopleByAge);
    }
}