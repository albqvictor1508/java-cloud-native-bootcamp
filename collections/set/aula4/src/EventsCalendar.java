import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class EventsCalendar {
    private Map<LocalDate, Event> events;

    public EventsCalendar() {
        events = new HashMap<>();
    }

    public void addNewEvent(String attraction, String name, LocalDate date) {
        events.put(date, new Event(name, attraction));
    }

    public void showEvents() {
        Map<LocalDate, Event> sortedEvents = new TreeMap<>(events); //ja pega porque LocalDate implementa o Comparable, então já faz a ordenação por data automaticamente porque é a key do Map
        System.out.println(sortedEvents);
    }
}
