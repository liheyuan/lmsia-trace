package com.coder4.sbmvt.trace.configuration;

import com.coder4.sbmvt.trace.TraceIdRequestLoggingFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author coder4
 */
@Configuration
@ConditionalOnWebApplication
public class TraceIdRequestLoggingFilterConfiguration {

    @Bean
    public TraceIdRequestLoggingFilter createTraceIdMDCFilter() {
        return new TraceIdRequestLoggingFilter();
    }

}