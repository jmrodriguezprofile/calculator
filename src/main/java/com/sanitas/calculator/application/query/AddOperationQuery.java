package com.sanitas.calculator.application.query;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/** AddOperationQuery */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddOperationQuery implements Serializable {
    @Serial
    private static final long serialVersionUID = 6527219682576711564L;

    private Double firstNumber;

    private Double secondNumber;

}
