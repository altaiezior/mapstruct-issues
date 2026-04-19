package org.example;

import java.util.List;
import java.util.Set;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
class RequestBean {
    String name;
    List<String> items;
    List<String> moreItems;
    Set<String> setItems;
}
