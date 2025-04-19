package dio.web.rest_api.controller;

import dio.web.rest_api.model.Client;
import dio.web.rest_api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {
    //faz a inversão de controle(pois instancia a classe e manipula seu objeto
    // como um singleton), e injeção de dependência se necessário
    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<Iterable<Client>> findAll() {
        return ResponseEntity.status(200).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id) {
        Client client = service.findById(id);
        if(client == null) return ResponseEntity.status(404).build();
        return ResponseEntity.status(200).body(client);
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client c) {
        return ResponseEntity.status(201).body(service.save(c));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateClient(@PathVariable Long id, @RequestBody Client c) {
        Client updatedClient = service.updateClientById(id, c);
        if(updatedClient == null) {
            return ResponseEntity.status(404).body("id not founded");
        }
        return ResponseEntity.status(200).body(updatedClient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable Long id) {
        Client deletedClient = service.deleteClient(id);
        if(deletedClient == null) {
            return ResponseEntity.status(404).body("id not founded");
        }
        return ResponseEntity.status(200).body(deletedClient);
    }
}
