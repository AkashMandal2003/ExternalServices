package com.jocata.externalservices.service.impl;

import com.jocata.externalservices.dao.CibilDao;
import com.jocata.externalservices.entity.CibilDetails;
import com.jocata.externalservices.payload.CibilPayLoad;
import com.jocata.externalservices.response.CibilResponse;
import com.jocata.externalservices.service.CibilService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CibilServiceImpl implements CibilService {

    private final CibilDao cibilDao;

    public CibilServiceImpl(CibilDao cibilDao) {
        this.cibilDao = cibilDao;
    }

    @Override
    public List<CibilResponse> getCibilDetails(CibilPayLoad cibilPayLoad) {
        List<CibilDetails> cibilDetails = cibilDao.getCibilDetails(cibilPayLoad.getPanNumber());
        List<CibilResponse> cibilResponses=new ArrayList<>();
        for (CibilDetails cibil:cibilDetails){
            CibilResponse responseCibil=getCibilResponse(cibil);
            cibilResponses.add(responseCibil);
        }
        return cibilResponses;
    }

    private static CibilResponse getCibilResponse(CibilDetails cibilDetails) {
        CibilResponse cibilResponse=new CibilResponse();
        cibilResponse.setPan(cibilDetails.getPan());
        cibilResponse.setStatus(cibilDetails.getStatus());
        cibilResponse.setCreditScore(String.valueOf(cibilDetails.getCreditScore()));
        cibilResponse.setCreditHistory(cibilDetails.getCreditHistory());
        cibilResponse.setTotalOutstandingBalance(String.valueOf(cibilDetails.getTotalOutstandingBalance()));
        cibilResponse.setPaymentHistory(cibilDetails.getPaymentHistory());
        cibilResponse.setRecentCreditInquiries(cibilDetails.getRecentCreditInquiries());
        cibilResponse.setCreditLimit(String.valueOf(cibilDetails.getCreditLimit()));
        cibilResponse.setReportDate(String.valueOf(cibilDetails.getReportDate()));
        return cibilResponse;
    }

}
