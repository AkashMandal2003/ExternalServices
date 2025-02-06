package com.jocata.externalservices.controller;

import com.jocata.externalservices.payload.AadharPayLoad;
import com.jocata.externalservices.payload.CibilPayLoad;
import com.jocata.externalservices.payload.ExternalServiceRequest;
import com.jocata.externalservices.payload.PanPayload;
import com.jocata.externalservices.response.AadharResponse;
import com.jocata.externalservices.response.CibilResponse;
import com.jocata.externalservices.response.ExternalServiceResponse;
import com.jocata.externalservices.response.PanResponse;
import com.jocata.externalservices.service.AadharService;
import com.jocata.externalservices.service.CibilService;
import com.jocata.externalservices.service.PanService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ExternalServicesController {

    private final PanService panService;
    private final AadharService aadharService;
    private final CibilService cibilService;

    public ExternalServicesController(PanService panService, AadharService aadharService, CibilService cibilService) {
        this.panService = panService;
        this.aadharService = aadharService;
        this.cibilService = cibilService;
    }

    @PostMapping("/getPanDetails")
    public ExternalServiceResponse<PanResponse> getPanInfoDetails(@RequestBody ExternalServiceRequest request) {

        PanPayload payload = request.getPanPayload();
        PanResponse panResponse = panService.getPanInfoDetails(payload);
        return new ExternalServiceResponse<>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), request.getTxnId(), panResponse);
    }

    @PostMapping("/getAadharDetails")
    public ExternalServiceResponse<AadharResponse> getAadharInfoDetails(@RequestBody ExternalServiceRequest request) {

        AadharPayLoad payload = request.getAadharPayLoad();
        AadharResponse aadharResponse = aadharService.getAadharInfoDetails(payload);
        return new ExternalServiceResponse<>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), request.getTxnId(), aadharResponse);
    }

    @PostMapping("/getCibilDetails")
    public ExternalServiceResponse<List<CibilResponse>> getCibilInfoDetails(@RequestBody ExternalServiceRequest request) {

        CibilPayLoad payload = request.getCibilPayLoad();
        List<CibilResponse> cibilResponse = cibilService.getCibilDetails(payload);
        return new ExternalServiceResponse<>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), request.getTxnId(), cibilResponse);
    }
}
