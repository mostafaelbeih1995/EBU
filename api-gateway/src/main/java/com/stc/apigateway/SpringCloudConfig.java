package com.stc.apigateway;

import com.netflix.discovery.converters.Auto;
import com.stc.apigateway.filter.TestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Autowired
    private TestFilter testFilter;

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("ebu-auth", r -> r.path("/api/ebu-auth/**")
                .filters(f -> f.filter(testFilter))
//                .addResponseHeader("responseHeader", "responseHeader value"))
                .uri("http://localhost:8082/"))
        .build();
    }
}
