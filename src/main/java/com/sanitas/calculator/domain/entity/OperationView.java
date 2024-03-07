package com.sanitas.calculator.domain.entity;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

/** OperationView */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperationView  implements Serializable {
    @Serial
    private static final long serialVersionUID = -4919798051178372115L;

    private UUID id;

    @NotNull(message = "sanitas.validators.result.notnull")
    private Double result;
}
