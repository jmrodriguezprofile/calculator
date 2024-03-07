package com.sanitas.calculator.infrastructure.adapters.inbound.rest.response;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperationResponse implements Serializable {

    @Serial
    private static final long serialVersionUID = -926443007017329130L;

    @Schema(
            name = "result",
            description = "The operation result",
            example = "1"
    )
    @NotNull(message = "sanitas.validators.result.notnull")
    private Double result;
}
