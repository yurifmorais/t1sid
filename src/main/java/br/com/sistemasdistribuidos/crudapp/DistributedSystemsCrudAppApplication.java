package br.com.sistemasdistribuidos.crudapp;

import br.com.sistemasdistribuidos.crudapp.domain.Car;
import br.com.sistemasdistribuidos.crudapp.domain.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class DistributedSystemsCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedSystemsCrudAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (CarRepository carRepository) {
		return args -> {
			Car car = new Car("Fusca", "Volkswagen", "Azul", 1970, "R$ 10.000,00");
			carRepository.insert(car);
		};
	}
}
