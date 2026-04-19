package org.example;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Set;
import org.mapstruct.factory.Mappers;

public class Main {
    public static void main(String[] args) {
        var requestBean = RequestBean.builder()
            .name("Mapstruct")
            .items(List.of("item1", "item2"))
            .moreItems(List.of("item3", "item4"))
            .setItems(Set.of("item5"))
            .build();
        var mapper = Mappers.getMapper(RequestMapper.class);
        var requestDto = mapper.toDto(requestBean);
        Preconditions.checkState(requestDto.getName().equals(requestBean.getName()));
        Preconditions.checkState(requestDto.getItems().equals(requestBean.getItems()));
        Preconditions.checkState(requestDto.getMoreItems().equals(requestBean.getMoreItems()));
        Preconditions.checkState(requestDto.getSetItems().equals(requestBean.getSetItems()));
    }
}
