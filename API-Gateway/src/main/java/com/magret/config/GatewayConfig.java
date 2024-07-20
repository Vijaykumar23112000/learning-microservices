package com.magret.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.magret.constants.HostName.SCHOOLS_BASE_URL;
import static com.magret.constants.HostName.STUDENTS_BASE_URL;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder
                .routes()
                .route("students",
                        route -> route
                                .path("/api/v1/students/**")
                                .uri(STUDENTS_BASE_URL)
                )
                .route("schools",
                        route -> route
                                .path("/api/v1/schools/**")
                                .uri(SCHOOLS_BASE_URL)
                        )
                .build();
    }

}
