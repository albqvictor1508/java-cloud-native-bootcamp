import java.util.HashMap;
import java.util.Map;

public class ContactMap {
  private Map<String, Integer> contacts; //{name: phone} => n sei se a estrutura é realmente essa, mas a do JS é assim

  public ContactMap() {
    contacts = new HashMap<>();
  }

  public void addNewContact(String name, int phone) {
    contacts.put(name, phone);
  }

  public void removeContact(String name) {
    if(!contacts.isEmpty()) {
      contacts.remove(name);
    }
  }

  public void showContacts() {
    System.out.println(contacts);
  }

  public Integer searchByName(String name) {
    Integer numberByName = null;
    if(contacts.containsKey(name)) {
      numberByName = contacts.get(name);
    }
    return numberByName;
  }
}
