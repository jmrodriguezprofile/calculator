package com.sanitas.calculator.application.ports.inbound;

import com.sanitas.calculator.application.query.AddOperationQuery;
import com.sanitas.calculator.domain.entity.OperationView;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/** AddElementsUseCaseServicePort */
@Validated
public interface AddElementsUseCaseServicePort {
    OperationView execute(@Valid @NotNull AddOperationQuery query);
}
