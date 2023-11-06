package br.com.sistemasdistribuidos.crudapp.domain.car;

import javax.validation.constraints.NotNull;

public record CarListingData(
        @NotNull
        String county,
        @NotNull
        String city,
        @NotNull
        String state,
        @NotNull
        String postalCode,
        @NotNull
        String modelYear,
        @NotNull
        String make,
        @NotNull
        String model,
        @NotNull
        String electricVehicleType,
        @NotNull
        String cleanAlternativeFuelVehicleEligibility) {
    public CarListingData(Car car) {
        this(
                car.getCounty(),
                car.getCity(),
                car.getState(),
                car.getPostalCode(),
                car.getModelYear(),
                car.getMake(),
                car.getModel(),
                car.getElectricVehicleType(),
                car.getCleanAlternativeFuelVehicleEligibility());
    }
}
