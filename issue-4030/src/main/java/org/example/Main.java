package org.example;

import com.google.common.base.Preconditions;
import org.mapstruct.factory.Mappers;

public class Main {
    public static void main(String[] args) {
        var requestBean = new RequestBean("MapStruct");
        Preconditions.checkState(requestBean.getCount() == 0);
        var mapper = Mappers.getMapper(RequestMapper.class);
        var requestDto = mapper.toDto(requestBean);
        Preconditions.checkState(requestDto.name().equals("MapStruct"));
        var count = requestBean.getCount();
        Preconditions.checkState(count == 1, "%s != 1", count);
    }
}
