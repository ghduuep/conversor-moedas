package br.com.conversormoedas.ConversorMoedas;

import br.com.conversormoedas.ConversorMoedas.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConversorMoedasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConversorMoedasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
