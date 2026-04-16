package org.example;

import lombok.Builder;

@Builder
record RequestBean(Integer deviceId, DeviceInfo deviceInfo, GeoBean geoBean) {
    public record DeviceInfo(Integer browserId, Integer osId) {
    }

    public record GeoBean(String country, String stateCode) {
    }
}
