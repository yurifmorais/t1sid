package br.com.sistemasdistribuidos.crudapp;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {
}