package com.sanitas.calculator.application.service;

import com.sanitas.calculator.application.ports.AddElementsUseCaseServicePort;
import com.sanitas.calculator.application.query.AddOperationQuery;
import com.sanitas.calculator.domain.entity.OperationView;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/** AddElementsUseCaseServiceImpl */
@Slf4j
@Service
@AllArgsConstructor
public class AddElementsUseCaseServiceImpl implements AddElementsUseCaseServicePort {
    @Override
    public OperationView execute(AddOperationQuery query) {
        return null;
    }
}
