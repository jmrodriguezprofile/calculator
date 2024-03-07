package com.sanitas.calculator.application.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/** SubtractOperationQuery */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubtractOperationQuery implements Serializable {

    @Serial
    private static final long serialVersionUID = 7515464044181293286L;

    private Double firstNumber;

    private Double secondNumber;
}
