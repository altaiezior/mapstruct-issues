package org.example;

import org.mapstruct.Mapper;

@Mapper(config = CentralConfig.class)
interface RequestMapper {
    RequestDto toDto(RequestBean requestBean);
}
