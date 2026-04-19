package org.example;

import java.util.List;
import java.util.Set;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

@Value
@Builder
class RequestDto {
    String name;

    @Singular("addItem")
    List<String> items;

    List<String> moreItems;

    Set<String> setItems;
}
