package br.com.sistemasdistribuidos.crudapp.domain.car;

import jakarta.persistence.*;
import lombok.*;


@Getter
@NoArgsConstructor
@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "county")
    private String county;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postalCode")
    private String postalCode;

    @Column(name = "modelYear")
    private String modelYear;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "electricVehicleType")
    private String electricVehicleType;

    @Column(name = "cleanAlternativeFuelVehicleEligibility")
    private String cleanAlternativeFuelVehicleEligibility;

    @Column(name = "electricRange")
    private String electricRange;

    @Column(name = "baseMsrp")
    private String baseMsrp;

    @Column(name = "legislativeDistrict")
    private String legislativeDistrict;

    @Column(name = "dolVehicleId")
    private String dolVehicleId;

    @Column(name = "vehicleLocation")
    private String vehicleLocation;

    @Column(name = "electricUtility")
    private String electricUtility;

    @Column(name = "censusTract")
    private String censusTract;

    //generate a constructor with all the fields
    public Car(String county, String city, String state, String postalCode, String modelYear, String make, String model, String electricVehicleType, String cleanAlternativeFuelVehicleEligibility, String electricRange, String baseMsrp, String legislativeDistrict, String dolVehicleId, String vehicleLocation, String electricUtility, String censusTract) {
        this.county = county;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.modelYear = modelYear;
        this.make = make;
        this.model = model;
        this.electricVehicleType = electricVehicleType;
        this.cleanAlternativeFuelVehicleEligibility = cleanAlternativeFuelVehicleEligibility;
        this.electricRange = electricRange;
        this.baseMsrp = baseMsrp;
        this.legislativeDistrict = legislativeDistrict;
        this.dolVehicleId = dolVehicleId;
        this.vehicleLocation = vehicleLocation;
        this.electricUtility = electricUtility;
        this.censusTract = censusTract;
    }

    //generate a constructor that receives a CarDataRegister object
    public Car(CarDataRegister carData) {
        this.county = carData.county();
        this.city = carData.city();
        this.state = carData.state();
        this.postalCode = carData.postalCode();
        this.modelYear = carData.modelYear();
        this.make = carData.make();
        this.model = carData.model();
        this.electricVehicleType = carData.electricVehicleType();
        this.cleanAlternativeFuelVehicleEligibility = carData.cleanAlternativeFuelVehicleEligibility();
    }
}
