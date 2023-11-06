package br.com.sistemasdistribuidos.crudapp.domain.car;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car")
@Entity(name = "Car")
@EqualsAndHashCode(of = "id")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String county;
    private String city;
    private String state;

    private String postalcode;

    private String modelyear;

    private String make;

    private String model;

    private String electricvehicletype;

    private String cleanalternativefuelvehicleeligibility;

    private String electricrange;

    private String basemsrp;

    private String legislativedistrict;

    private String dolvehicleid;

    private String vehiclelocation;

    private String electricutility;

    private String censustract;

    //generate a constructor with all the fields
    public Car(String county, String city, String state, String postalcode, String modelyear, String make, String model, String electricvehicletype, String cleanalternativefuelvehicleeligibility, String electricrange, String basemsrp, String legislativedistrict, String dolvehicleid, String vehiclelocation, String electricutility, String censustract) {
        this.county = county;
        this.city = city;
        this.state = state;
        this.postalcode = postalcode;
        this.modelyear = modelyear;
        this.make = make;
        this.model = model;
        this.electricvehicletype = electricvehicletype;
        this.cleanalternativefuelvehicleeligibility = cleanalternativefuelvehicleeligibility;
        this.electricrange = electricrange;
        this.basemsrp = basemsrp;
        this.legislativedistrict = legislativedistrict;
        this.dolvehicleid = dolvehicleid;
        this.vehiclelocation = vehiclelocation;
        this.electricutility = electricutility;
        this.censustract = censustract;
    }

    //generate a constructor that receives a CarDataRegister object
    public Car(CarDataRegister carData) {
        this.county = carData.county();
        this.city = carData.city();
        this.state = carData.state();
        this.postalcode = carData.postalcode();
        this.modelyear = carData.modelyear();
        this.make = carData.make();
        this.model = carData.model();
        this.electricvehicletype = carData.electricvehicletype();
        this.cleanalternativefuelvehicleeligibility = carData.cleanalternativefuelvehicleeligibility();
    }
}
