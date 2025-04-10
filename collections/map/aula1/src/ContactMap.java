import java.util.HashMap;
import java.util.Map;

public class ContactMap {
  private Map<String, String> contacts; //{name: phone} => n sei se a estrutura é realmente essa, mas a do JS é assim

  public ContactMap() {
    contacts = new HashMap<>();
  }

  public void addNewContact(String name, String phone) {
    contacts.put(name, phone);
  }

  public void removeContact(String name) {
    if(contacts.containsKey(name)) {
      contacts.remove(name);
    };
  }

  public void showContacts() {
    System.out.println(contacts);
  }

  public void searchByName(String name) {
    contacts.containsValue(name);
  }
}
