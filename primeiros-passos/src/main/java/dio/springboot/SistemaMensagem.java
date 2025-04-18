package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente funcionario;

    public void enviarConfirmacao() {
        noreply.showEmail();
        funcionario.setMessage("funcionário safado");
        funcionario.setEmail("jobs@agilitytelecom.com");
        funcionario.showEmail();
    }
}
