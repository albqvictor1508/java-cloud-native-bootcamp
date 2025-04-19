package dio.web.rest_api.service;

import dio.web.rest_api.model.Client;
import dio.web.rest_api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService implements IClientService {
    @Autowired
    private ClientRepository repository;

    public Client findById(Long id) {
        Client client = repository.findById(id).orElse(null);
        return client;
    }

    @Override
    public Client updateClientById(Long id, Client c) {
        if(!(repository.existsById(id))) return null;
        return repository.updateClientById(id, c);
    }

    public Iterable<Client> findAll() {
        return repository.findAll();
    }

    public Client save(Client c) {
        return repository.save(c);
    }

        public Client deleteClient(Long id) {
            if(!(repository.existsById(id))) return null;
            Client deletedClient = repository.findById(id).get();
            repository.deleteById(id);
            return deletedClient;
        }
}
