package daw.evaluaciont1.sanca.evaluaciont1_sanca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Evaluaciont1SancaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Evaluaciont1SancaApplication.class, args);
	}

}
