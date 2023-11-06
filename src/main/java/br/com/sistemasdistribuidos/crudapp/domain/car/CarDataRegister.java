package br.com.sistemasdistribuidos.crudapp.domain.car;

import javax.validation.constraints.NotNull;

public record CarDataRegister(@NotNull
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
}

