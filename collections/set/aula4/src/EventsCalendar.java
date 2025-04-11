import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class EventsCalendar {
    private Map<LocalDate, Event> events;
    // ja pega porque LocalDate implementa o Comparable, então já faz a ordenação
    // por data automaticamente porque é a key do Map
    private Map<LocalDate, Event> sortedEvents = new TreeMap<>(events);

    public EventsCalendar() {
        events = new HashMap<>();
    }

    public void addNewEvent(String attraction, String name, LocalDate date) {
        events.put(date, new Event(name, attraction));
    }

    public void showEvents() {

        System.out.println(sortedEvents);
    }

    public void getNextEvent() {
        Set<LocalDate> sets = events.keySet(); // retorna um set com as chaves
        Collection<Event> velhus = events.values(); // retorna uma collection de values
        //entrySet() --> retorna um set com as chaves e valores do Map
        //Map.Entry<Key, Value> --> pega a chave e o valor do entrySet() e coloca em um Map
        //já nesse for, o Map.Entry ta pegando cada chave / valor do entry e transformando em um Map 

        LocalDate now = LocalDate.now();
        
        for (Map.Entry<LocalDate, Event> entry : events.entrySet()) {
            if (entry.getKey().isEqual(now) || entry.getKey().isAfter(now)) {
                System.out.println("The next event its on" + entry.getKey());
            }
        }
    }
}
