package br.com.sistemasdistribuidos.crudapp;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data //vai gerar os getters e setters, constructor, etc
@Document
public class Car {
    @Id
    private String id;
    private String model;
    private String brand;
    private String color;
    private int year;
    private String price;

    //generate a constructor withou id
    public Car(String model, String brand, String color, int year, String price) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}