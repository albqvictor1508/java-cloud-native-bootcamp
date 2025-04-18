package facade;

import facade.crm.CrmService;
import facade.dto.ClientDTO;

import java.util.Map;

public class Facade {
    private static class InstanceHolder {
        public static Facade instance = new Facade();
    }
    public static Facade getInstance() {
        return InstanceHolder.instance;
    }
    public void saveClient(String name, int age, long cep) {
        Map<Long, ClientDTO> client = CrmService.saveClient(name, );
    }
}
