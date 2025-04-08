import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public void sortByHeight() {
        List<Person> peopleByHeight = new ArrayList<>(people);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
    }
}

class ComparatorByHeight implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Double.compare(p1.height(), p2.height());
    }
}