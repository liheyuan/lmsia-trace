package com.coder4.sbmvt.trace;

import java.util.Random;

/**
 * @author coder4
 */
public class TraceIdUtils {

    private static final Random random = new Random(System.currentTimeMillis());

    public static String getTraceId() {
        // 随机正整数的16进制化
        return Long.toString(Math.abs(random.nextLong()), 16);
    }

}