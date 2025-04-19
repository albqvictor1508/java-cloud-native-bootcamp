package dio.web.rest_api.service;

import dio.web.rest_api.model.Client;

public interface IClientService {
    Client save(Client c);
    Iterable<Client> findAll();
    Client findById(Long id);
}
