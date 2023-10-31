package br.com.sistemasdistribuidos.crudapp.domain;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data //vai gerar os getters e setters, constructor, etc
@Document
public class Car {
    @Id
    private String id;
    private String county;
    private String city;
    private String state;
    private String postalCode;
    private String modelYear;
    private String make;
    private String model;
    private String electricVehicleType;
    private String cleanAlternativeFuelVehicleEligibility;

    //generate a constructor withou id
    public Car(String county, String city, String state, String postalCode, String modelYear, String make, String model, String electricVehicleType, String cleanAlternativeFuelVehicleEligibility) {
        this.county = county;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.modelYear = modelYear;
        this.make = make;
        this.model = model;
        this.electricVehicleType = electricVehicleType;
        this.cleanAlternativeFuelVehicleEligibility = cleanAlternativeFuelVehicleEligibility;
    }
}