package com.sanitas.calculator.application.service;

import com.sanitas.calculator.application.ports.inbound.SubtractElementsUseCaseServicePort;
import com.sanitas.calculator.application.query.SubtractOperationQuery;
import com.sanitas.calculator.domain.entity.OperationView;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/** SubtractElementsUseCaseServiceImpl */
@Slf4j
@Service
@AllArgsConstructor
public class SubtractElementsUseCaseServiceImpl implements SubtractElementsUseCaseServicePort {
    @Override
    public OperationView execute(SubtractOperationQuery query) {
        if(log.isInfoEnabled()){
            log.info("[start] - SubtractElementsUseCaseServiceImpl.execute - fistNumber '{}' - SecondNumber {}"
                    , query.getFirstNumber(), query.getSecondNumber());
        }

        var result = OperationView.builder().
                id(UUID.randomUUID())
                .result(query.getFirstNumber() - query.getSecondNumber())
                .build();

        if(log.isInfoEnabled()){
            log.info("[end] - SubtractElementsUseCaseServiceImpl.execute - fistNumber '{}' - SecondNumber {} - " +
                            "result {} "
                    , query.getFirstNumber(), query.getSecondNumber(), result.getResult());
        }
        return result;
    }
}
