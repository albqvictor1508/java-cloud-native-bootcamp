package dio.web.rest_api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "viacep.com.br/ws/01001000/json/ ")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    Address consultCep(@Pat)
}
