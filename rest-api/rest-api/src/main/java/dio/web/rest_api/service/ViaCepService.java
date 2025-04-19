package dio.web.rest_api.service;

import dio.web.rest_api.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "viacep.com.br/ws")
public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    Address consultCep(@PathVariable("cep") String cep);
}
