package com.sanitas.calculator.application.service;

import com.sanitas.calculator.application.query.AddOperationQuery;
import com.sanitas.calculator.domain.entity.OperationView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles({"test"})
@TestPropertySource(
        properties = {"spring.config.location=classpath:application-test.yml"}
)
public class AddElementsUseCaseServiceImplTest {

    @InjectMocks
    private AddElementsUseCaseServiceImpl addElementsUseCaseService;

    @BeforeEach
    public void setUp() {

        this.addElementsUseCaseService = new AddElementsUseCaseServiceImpl();
    }

    @Test
    void executeWithPositiveNumbers(){

        OperationView result = addElementsUseCaseService.execute(
                AddOperationQuery.builder()
                        .firstNumber(1.0)
                        .secondNumber(1.0)
                        .build()
        );

        OperationView response = OperationView.builder()
                .id(result.getId())
                .result(2.0)
                .build();
        assertEquals(result,response);
    }

    @Test
    void executeWithNegativeAndPositiveNumbers(){

        OperationView result = addElementsUseCaseService.execute(
                AddOperationQuery.builder()
                        .firstNumber(1.0)
                        .secondNumber(-1.0)
                        .build()
        );

        OperationView response = OperationView.builder()
                .id(result.getId())
                .result(0.0)
                .build();
        assertEquals(result,response);
    }

    @Test
    void executeWithNegativeNumbers(){

        OperationView result = addElementsUseCaseService.execute(
                AddOperationQuery.builder()
                        .firstNumber(-1.0)
                        .secondNumber(-1.0)
                        .build()
        );

        OperationView response = OperationView.builder()
                .id(result.getId())
                .result(-2.0)
                .build();
        assertEquals(result,response);
    }
}
