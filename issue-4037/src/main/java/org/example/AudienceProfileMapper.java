package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = CentralConfig.class)
interface AudienceProfileMapper {
    @Mapping(target = "deviceId", source = "requestBean.deviceId")
    @Mapping(target = "browserId", source = "requestBean.deviceInfo.browserId")
    @Mapping(target = "osId", source = "requestBean.deviceInfo.osId")
    @Mapping(target = "country", source = "requestBean.geoBean.country")
    @Mapping(target = "stateCode", source = "requestBean.geoBean.stateCode")
    AudienceProfileRequest map(RequestBean requestBean, String slotId);
}
