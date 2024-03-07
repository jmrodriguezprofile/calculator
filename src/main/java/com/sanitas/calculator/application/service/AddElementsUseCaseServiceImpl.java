package com.sanitas.calculator.application.service;

import com.sanitas.calculator.application.ports.AddElementsUseCaseServicePort;
import com.sanitas.calculator.application.query.AddOperationQuery;
import com.sanitas.calculator.domain.entity.OperationView;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/** AddElementsUseCaseServiceImpl */
@Slf4j
@Service
@AllArgsConstructor
public class AddElementsUseCaseServiceImpl implements AddElementsUseCaseServicePort {
    @Override
    public OperationView execute(AddOperationQuery query) {

        if(log.isInfoEnabled()){
            log.info("[start] - AddElementsUseCaseServiceImpl.execute - fistNumber '{}' - SecondNumber {}"
                    , query.getFirstNumber(), query.getSecondNumber());
        }

        var result = OperationView.builder().
                id(UUID.randomUUID())
                .result(query.getFirstNumber() + query.getSecondNumber())
                .build();

        if(log.isInfoEnabled()){
            log.info("[end] - AddElementsUseCaseServiceImpl.execute - fistNumber '{}' - SecondNumber {} - " +
                            "result {} "
                    , query.getFirstNumber(), query.getSecondNumber(), result.getResult());
        }
        return result;
    }
}
