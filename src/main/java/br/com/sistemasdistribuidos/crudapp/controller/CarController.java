package br.com.sistemasdistribuidos.crudapp.controller;

import br.com.sistemasdistribuidos.crudapp.domain.car.Car;
import br.com.sistemasdistribuidos.crudapp.domain.car.CarDataRegister;
import br.com.sistemasdistribuidos.crudapp.domain.car.CarListingData;
import br.com.sistemasdistribuidos.crudapp.domain.car.CarRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public Page<CarListingData> getCars(@RequestParam(defaultValue = "0") int page) {
        Pageable pageable = PageRequest.of(page, 20);
        return carRepository.findAll(pageable).map(CarListingData::new);
    }

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid CarDataRegister carData, UriComponentsBuilder uriBuilder) {
        var car = new Car(carData);
        carRepository.save(car);
        var uri = uriBuilder.path("/cars/{model}").buildAndExpand(car.getModel()).toUri();
        return ResponseEntity.created(uri).body(new CarListingData(car));
    }
}