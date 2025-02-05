package com.jocata.externalservices.service;

import com.jocata.externalservices.payload.AadharPayLoad;
import com.jocata.externalservices.response.AadharResponse;

public interface AadharService {
    AadharResponse getAadharInfoDetails(AadharPayLoad payLoad);
}
