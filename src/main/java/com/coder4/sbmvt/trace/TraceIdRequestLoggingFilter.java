package com.coder4.sbmvt.trace;

import org.springframework.web.filter.AbstractRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;

/**
 * @author coder4
 */
public class TraceIdRequestLoggingFilter extends AbstractRequestLoggingFilter {
    @Override
    protected void beforeRequest(HttpServletRequest request, String message) {
        TraceIdContext.setTraceId(TraceIdUtils.getTraceId());
    }

    @Override
    protected void afterRequest(HttpServletRequest request, String message) {
        TraceIdContext.removeTraceId();
    }
}