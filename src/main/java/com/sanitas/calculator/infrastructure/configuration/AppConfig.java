package com.sanitas.calculator.infrastructure.configuration;

import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public TracerImpl tracerAPI() {
        // Creas una instancia de TracerApiImpl y la devuelves como TracerAPI
        return new TracerImpl();
    }
}
