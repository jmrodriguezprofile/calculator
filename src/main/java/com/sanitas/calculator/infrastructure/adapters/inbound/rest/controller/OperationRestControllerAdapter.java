package com.sanitas.calculator.infrastructure.adapters.inbound.rest.controller;

import com.sanitas.calculator.domain.entity.RestErrorEntity;
import com.sanitas.calculator.infrastructure.adapters.inbound.rest.response.OperationResponse;
import com.sanitas.calculator.infrastructure.configuration.ApiResponseConfiguration;
import com.sanitas.calculator.infrastructure.configuration.ResponsesConfiguration;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** OperationRestControllerAdapter */
@Validated
@RequestMapping(value = "${api.endpoints.operations.mapping}")
@Tag(
        name = "operations",
        description = "Operations API"
)
public interface OperationRestControllerAdapter {

    @Operation(
            description = "The addition is performed between two input parameters",
            responses = {
                    @ApiResponse(
                            responseCode = ApiResponseConfiguration.RESPONSE_200_CODE,
                            description = ApiResponseConfiguration.RESPONSE_200,
                            content = @Content(schema = @Schema(implementation = OperationResponse.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = ResponsesConfiguration.RESPONSE_400,
                            content = @Content(schema = @Schema(implementation = RestErrorEntity.class))),
                    @ApiResponse(
                            responseCode = "500",
                            description = ResponsesConfiguration.RESPONSE_500,
                            content = @Content(schema = @Schema(implementation = RestErrorEntity.class)))
            })
    @GetMapping(path = "/add",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> sumNumbers(
            @Parameter(name = "firstNumber", description = "firstNumber", in = ParameterIn.QUERY)
            @RequestParam(value = "firstNumber")
            @NotNull(message = "sanitas.validators.firstnumber.notnull")
            @Valid Double firstNumber,
            @Parameter(name = "secondNumber", description = "secondNumber", in = ParameterIn.QUERY)
            @RequestParam(value = "secondNumber")
            @NotNull(message = "sanitas.validators.secondnumber.notnull")
            @Valid Double secondNumber);

    @Operation(
            description = "The addition is performed between two input parameters",
            responses = {
                    @ApiResponse(
                            responseCode = ApiResponseConfiguration.RESPONSE_200_CODE,
                            description = ApiResponseConfiguration.RESPONSE_200,
                            content = @Content(schema = @Schema(implementation = OperationResponse.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = ResponsesConfiguration.RESPONSE_400,
                            content = @Content(schema = @Schema(implementation = RestErrorEntity.class))),
                    @ApiResponse(
                            responseCode = "500",
                            description = ResponsesConfiguration.RESPONSE_500,
                            content = @Content(schema = @Schema(implementation = RestErrorEntity.class)))
            })
    @GetMapping(path = "/subtract",produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> subtractNumbers(
            @Parameter(name = "firstNumber", description = "firstNumber", in = ParameterIn.QUERY)
            @RequestParam(value = "firstNumber")
            @NotNull(message = "sanitas.validators.firstnumber.notnull")
            @Valid Double firstNumber,
            @Parameter(name = "secondNumber", description = "secondNumber", in = ParameterIn.QUERY)
            @RequestParam(value = "secondNumber")
            @NotNull(message = "sanitas.validators.secondnumber.notnull")
            @Valid Double secondNumber);
}
