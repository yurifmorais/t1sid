package br.com.sistemasdistribuidos.crudapp.domain.car;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
