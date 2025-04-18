package dio.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@agilitytelecom.com");
        remetente.setMessage("Cadastro concluido com sucesso!");
        return remetente;
    };
}
