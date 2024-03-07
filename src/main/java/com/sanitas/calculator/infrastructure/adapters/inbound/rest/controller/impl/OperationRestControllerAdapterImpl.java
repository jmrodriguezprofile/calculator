package com.sanitas.calculator.infrastructure.adapters.inbound.rest.controller.impl;

import com.sanitas.calculator.application.ports.AddElementsUseCaseServicePort;
import com.sanitas.calculator.application.query.AddOperationQuery;
import com.sanitas.calculator.infrastructure.adapters.inbound.rest.controller.OperationRestControllerAdapter;
import com.sanitas.calculator.infrastructure.adapters.inbound.rest.mapper.OperationRestInboundMapper;
import com.sanitas.calculator.infrastructure.adapters.inbound.rest.response.OperationResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/** OperationRestControllerAdapterImpl */
@RestController
@RequiredArgsConstructor
@Slf4j
public class OperationRestControllerAdapterImpl implements OperationRestControllerAdapter {

    private final OperationRestInboundMapper operationRestInboundMapper;
    private final AddElementsUseCaseServicePort addElementsUseCaseService;

    @Override
    public ResponseEntity<?> sumNumbers(Double firstNumber, Double secondNumber) {

        if(log.isInfoEnabled()){
            log.info("[start] - OperationRestControllerAdapterImpl.sumNumbers - fistNumber '{}' - SecondNumber {}"
                    , firstNumber, secondNumber);
        }


        final AddOperationQuery query = AddOperationQuery.builder()
                .firstNumber(firstNumber)
                .secondNumber(secondNumber)
                .build();

        var price = this.operationRestInboundMapper.operationViewToViewResponse(
                addElementsUseCaseService.execute(query));

        var responseEntity = getOperationResponse(price);

        if(log.isInfoEnabled()){
            log.info("[end] - OperationRestControllerAdapterImpl.sumNumbers - fistNumber '{}' - SecondNumber {}" +
                            " - result {}"
                    , firstNumber, secondNumber, responseEntity);
        }
        return responseEntity;
    }

    @Override
    public ResponseEntity<?> subtractNumbers(Double firstNumber, Double secondNumber) {
        return null;
    }

    private ResponseEntity getOperationResponse(OperationResponse responseEntity){
        HttpHeaders responseListHeaders = this.addResponseHeaders(new HttpHeaders());
        return (ResponseEntity.ok().headers(responseListHeaders)).body(responseEntity);
    }

    private HttpHeaders addResponseHeaders(@Valid @NotNull HttpHeaders responseHeaders) {
        responseHeaders.add("Cache-Control", "no store, private, max-age=0");
        responseHeaders.add("Content-Type", "application/json");
        return responseHeaders;
    }

}
