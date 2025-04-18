package facade;

import facade.cep.CepService;
import facade.crm.CrmService;
import facade.dto.ClientDTO;

import java.util.HashMap;
import java.util.Map;

public class Facade {
    private Map<Long, ClientDTO> client = new HashMap<>();

    private static class InstanceHolder {
        public static Facade instance = new Facade();
    }
    public static Facade getInstance() {
        return InstanceHolder.instance;
    }
    public void saveClient(String name, int age, long cep) {
        String city = CepService.getInstance().getCityByCep(cep);
        String state = CepService.getInstance().getStateByCep(cep);
        this.client = client = CrmService.saveClient(name, age,cep,city,state);
    }

    public ClientDTO showClientByCep(long cep) {
        return client.get(cep);
    }
}
