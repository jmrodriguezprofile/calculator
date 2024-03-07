package com.sanitas.calculator.infrastructure.adapters.inbound.rest.mapper;

import com.sanitas.calculator.domain.entity.OperationView;
import com.sanitas.calculator.infrastructure.adapters.inbound.rest.response.OperationResponse;
import org.mapstruct.Mapper;

/** OperationRestInboundMapper */
@Mapper(componentModel = "spring")
public interface OperationRestInboundMapper {
    OperationResponse operationViewToViewResponse(OperationView result);

}
