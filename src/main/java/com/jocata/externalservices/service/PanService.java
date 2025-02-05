package com.jocata.externalservices.service;

import com.jocata.externalservices.payload.PanPayload;
import com.jocata.externalservices.response.PanResponse;

public interface PanService {

    PanResponse getPanInfoDetails(PanPayload payload);
}
