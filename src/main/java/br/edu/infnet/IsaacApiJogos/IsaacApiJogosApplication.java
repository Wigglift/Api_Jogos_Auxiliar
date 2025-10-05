package br.edu.infnet.IsaacApiJogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IsaacApiJogosApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsaacApiJogosApplication.class, args);
	}

}
