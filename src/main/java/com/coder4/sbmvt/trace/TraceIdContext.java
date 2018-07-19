package com.coder4.sbmvt.trace;

import org.slf4j.MDC;

/**
 * @author coder4
 */
public class TraceIdContext {

    public static final String TRACE_ID_KEY = "TRACE_ID";

    public static void setTraceId(String traceId) {
        if (traceId != null && !traceId.isEmpty()) {
            MDC.put(TRACE_ID_KEY, traceId);
        }
    }

    public static String getTraceId() {
        String traceId = MDC.get(TRACE_ID_KEY);
        if (traceId == null) {
            return "";
        }
        return traceId;
    }

    public static void removeTraceId() {
        MDC.remove(TRACE_ID_KEY);
    }
}