package com.sanitas.calculator.application.ports.inbound;

import com.sanitas.calculator.application.query.SubtractOperationQuery;
import com.sanitas.calculator.domain.entity.OperationView;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/** SubtractElementsUseCaseServicePort */
public interface SubtractElementsUseCaseServicePort {

    OperationView execute(@Valid @NotNull SubtractOperationQuery query);
}
