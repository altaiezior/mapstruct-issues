package org.example;

import java.util.concurrent.atomic.AtomicInteger;
import lombok.Value;

@Value
class RequestBean {
    AtomicInteger counter = new AtomicInteger();
    String name;

    public String getName() {
        counter.incrementAndGet();
        // some heavy processing
        return name;
    }

    public int getCount() {
        return counter.get();
    }
}
