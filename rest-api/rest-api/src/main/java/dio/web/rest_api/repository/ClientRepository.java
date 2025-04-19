package dio.web.rest_api.repository;

import dio.web.rest_api.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //não precisa colocar se n quiser
public interface ClientRepository extends JpaRepository<Client, Long> {
}
