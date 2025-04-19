package dio.web.rest_api.service;

import dio.web.rest_api.model.Address;
import dio.web.rest_api.model.Client;
import dio.web.rest_api.repository.AddressRepository;
import dio.web.rest_api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    public Client findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client updateClientById(Long id, Client c) {
        if(!clientRepository.existsById(id)) return null;
        saveClientByCep(c);
        return clientRepository.updateClientById(id, c);
    }

    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client save(Client c) {
        saveClientByCep(c);
        return clientRepository.save(c);
    }

        public Client deleteClient(Long id) {
            if(!(clientRepository.existsById(id))) return null;
            Client deletedClient = clientRepository.findById(id).get();
            clientRepository.deleteById(id);
            return deletedClient;
        }

        private void saveClientByCep(Client c) {
            String cep = c.getAddress().getCep();
            Address address = addressRepository.findById(cep).orElseGet(() -> {
                Address newAddress = viaCepService.consultCep(cep);
                addressRepository.save(newAddress);
                return newAddress;
            });
            c.setAddress(address);
        }
}
