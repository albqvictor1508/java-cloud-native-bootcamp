import java.util.HashSet;
import java.util.Set;

public class ContactList {
    private Set<Contact> contacts;

    public ContactList() {
        contacts = new HashSet<>();
    }

    public void findByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();
        for(Contact c : this.contacts) {
            if(c.name().startsWith(name)) {
                contactsByName.add(c);
            }
        }
    }
}
