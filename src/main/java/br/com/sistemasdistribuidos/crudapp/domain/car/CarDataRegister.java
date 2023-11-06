package br.com.sistemasdistribuidos.crudapp.domain.car;

import javax.validation.constraints.NotNull;

public record CarDataRegister(
                              String county,
                              @NotNull
                              String city,
                              @NotNull
                              String state,
                              String postalCode,
                              @NotNull
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
}
