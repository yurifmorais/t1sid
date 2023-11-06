package br.com.sistemasdistribuidos.crudapp.domain.car;

import jakarta.validation.constraints.NotNull;

public record CarDataRegister(@NotNull
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
}