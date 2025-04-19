package dio.web.rest_api.service;

import dio.web.rest_api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public void findById(Long id) {

    }
}
