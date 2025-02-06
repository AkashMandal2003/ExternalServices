package com.jocata.externalservices.service;

import com.jocata.externalservices.payload.CibilPayLoad;
import com.jocata.externalservices.response.CibilResponse;

import java.util.List;

public interface CibilService {

    List<CibilResponse> getCibilDetails(CibilPayLoad cibilPayLoad);

}
