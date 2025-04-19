package dio.web.rest_api.service;

import dio.web.rest_api.model.Client;
import dio.web.rest_api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public Client findById(Long id) {
        if(!(repository.existsById(id))) {
            return null;
        }
        Client client = repository.findById(id).get();
        return client;
    }

    public Iterable<Client> findAll() {
        return repository.findAll();
    }
}
