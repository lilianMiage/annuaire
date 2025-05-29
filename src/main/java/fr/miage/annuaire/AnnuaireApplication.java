package fr.miage.annuaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AnnuaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnuaireApplication.class, args);
	}

}
