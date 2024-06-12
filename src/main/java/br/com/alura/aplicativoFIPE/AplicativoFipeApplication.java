package br.com.alura.aplicativoFIPE;

import br.com.alura.aplicativoFIPE.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplicativoFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AplicativoFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}