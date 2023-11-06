package br.com.sistemasdistribuidos.crudapp.domain.car;

import jakarta.validation.constraints.NotNull;

public record CarListingData(@NotNull
                             Long id,
                             @NotNull
                             String county,
                             @NotNull
                             String city,
                             @NotNull
                             String state,
                             @NotNull
                             String postalcode,
                             @NotNull
                             String modelyear,
                             @NotNull
                             String make,
                             @NotNull
                             String model,
                             @NotNull
                             String electricvehicletype,
                             @NotNull
                             String cleanalternativefuelvehicleeligibility) {
    public CarListingData(Car car) {
        this(car.getId(),
                car.getCounty(),
                car.getCity(),
                car.getState(),
                car.getPostalcode(),
                car.getModelyear(),
                car.getMake(),
                car.getModel(),
                car.getElectricvehicletype(),
                car.getCleanalternativefuelvehicleeligibility());
    }
}
