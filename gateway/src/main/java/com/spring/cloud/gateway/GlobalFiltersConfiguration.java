package com.spring.cloud.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import reactor.core.publisher.Mono;

@Configuration
public class GlobalFiltersConfiguration {

    private final Logger logger = LoggerFactory.getLogger(PostFilter.class);

    @Bean
    @Order(1)
    public GlobalFilter secondGlobalfilter() {
        return ((exchange, chain) -> {
            logger.info("Enter to second global pre-filter!");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                logger.info("Enter to second global post-filter!");
            }));
        });
    }
}
