package facade.crm;

import facade.dto.ClientDTO;

import java.util.HashMap;
import java.util.Map;

public class CrmService {
    private static final Map<Long, ClientDTO> clients = new HashMap<>();

    private CrmService() {
        super();
    }

    public static Map<Long, ClientDTO> saveClient(String name, int age, long cep, String city, String state) {
        clients.put(cep, new ClientDTO(name, age, city, state));
        return clients;
    }
}
