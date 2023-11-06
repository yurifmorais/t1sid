package br.com.sistemasdistribuidos.crudapp.domain.car;

import javax.validation.constraints.NotNull;

public record CarListingData(
        @NotNull
        String county,
        @NotNull
        String city,
        @NotNull
        String state,
        String postalCode,
        String modelYear,
        @NotNull
        String make,
        @NotNull
        String model,
        String electricVehicleType,
        String cleanAlternativeFuelVehicleEligibility,
        String electricRange,
        String baseMsrp,
        String legislativeDistrict,
        String dolVehicleId,
        String vehicleLocation,
        String electricUtility,
        String censusTract) {
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
                car.getCleanAlternativeFuelVehicleEligibility(),
                car.getElectricRange(),
                car.getBaseMsrp(),
                car.getLegislativeDistrict(),
                car.getDolVehicleId(),
                car.getVehicleLocation(),
                car.getElectricUtility(),
                car.getCensusTract());
    }
}