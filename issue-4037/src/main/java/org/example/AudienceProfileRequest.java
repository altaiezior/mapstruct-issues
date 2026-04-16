package org.example;

import lombok.Builder;

@Builder
record AudienceProfileRequest(
    Integer deviceId,
    Integer browserId,
    Integer osId,
    String country,
    String stateCode,
    String slotId
) {
}
