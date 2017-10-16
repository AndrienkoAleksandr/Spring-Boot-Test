package org.example.util;

import java.util.concurrent.atomic.AtomicLong;

public class ShapeUniqueIdGenerator {

    private static final AtomicLong counter = new AtomicLong();

    public static long generateUniqueId() {
        return counter.incrementAndGet();
    }
}
