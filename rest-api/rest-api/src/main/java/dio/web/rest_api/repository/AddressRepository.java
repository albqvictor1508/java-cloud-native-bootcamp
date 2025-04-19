package dio.web.rest_api.repository;

import dio.web.rest_api.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
    boolean existsByCep(String cep);
}
