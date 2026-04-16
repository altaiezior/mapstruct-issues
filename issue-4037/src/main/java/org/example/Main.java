package org.example;

import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.factory.Mappers;

public class Main {
    public static void main(String[] args) {
        var mapper = Mappers.getMapper(AudienceProfileMapper.class);
        var requestBean = RequestBean.builder()
            .deviceId(345)
            .deviceInfo(new RequestBean.DeviceInfo(123, 456))
            .geoBean(new RequestBean.GeoBean("US", "CA"))
            .build();

        var profile = mapper.map(requestBean, StringUtils.EMPTY);
        Preconditions.checkNotNull(profile.browserId(), "Browser ID cannot be null");
        Preconditions.checkNotNull(profile.osId(), "OS ID cannot be null");
        Preconditions.checkNotNull(profile.country(), "Country cannot be null");
        Preconditions.checkNotNull(profile.stateCode(), "State code cannot be null");
        Preconditions.checkNotNull(profile.deviceId(), "Device ID cannot be null");
        System.out.println(profile);
    }
}
