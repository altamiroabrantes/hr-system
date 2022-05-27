package br.com.altamiro.userapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import br.com.altamiro.userapi.domain.User;
import br.com.altamiro.userapi.repositories.UserRepository;

@SpringBootApplication
@EnableEurekaClient
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.saveAll(List.of(new User(null, "Altamiro Abrantes", "altamiro.abrantes@gmail.com", "123", 20.0)));
	}

}
