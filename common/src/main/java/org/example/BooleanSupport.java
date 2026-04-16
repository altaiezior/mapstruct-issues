package org.example;

import org.apache.commons.lang3.BooleanUtils;

public class BooleanSupport {
    public String toString(Boolean value) {
        return BooleanUtils.toString(value, "1", "0", null);
    }

    public Integer toIntegerObject(Boolean value) {
        return BooleanUtils.toIntegerObject(value);
    }
}
