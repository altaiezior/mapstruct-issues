package org.example;

import java.util.Collection;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Condition;

public class PrechecksSupport {
    @Condition
    public boolean isNotBlank(String value) {
        return StringUtils.isNotBlank(value);
    }

    @Condition
    public boolean isNotEmpty(Object[] value) {
        return value != null && value.length > 0;
    }

    @Condition
    public boolean isNotEmpty(Collection<?> value) {
        return CollectionUtils.isNotEmpty(value);
    }

    @Condition
    public boolean isNotEmpty(Map<?, ?> value) {
        return MapUtils.isNotEmpty(value);
    }
}
