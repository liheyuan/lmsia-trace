package com.coder4.sbmvt.trace;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author coder4
 */
public class TraceIdUtils {

    public static String getTraceId() {
        // 随机正整数的16进制化
        return Long.toString(Math.abs(ThreadLocalRandom.current().nextLong()), 16);
    }

}