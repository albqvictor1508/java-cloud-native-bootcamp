package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner run(SistemaMensagem sistema) {
//		return args -> {
//			sistema.enviarConfirmacao();
//		};
//	}

	@Bean
	public CommandLineRunner run(MessageSystem system) {
		return args -> {
			system.run();
		};
	}
}
