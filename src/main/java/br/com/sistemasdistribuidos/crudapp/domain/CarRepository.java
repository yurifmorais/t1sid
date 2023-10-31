package br.com.sistemasdistribuidos.crudapp.domain;

import br.com.sistemasdistribuidos.crudapp.domain.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {
}