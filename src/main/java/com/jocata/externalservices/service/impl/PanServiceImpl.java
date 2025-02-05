package com.jocata.externalservices.service.impl;

import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.entity.PanDetails;
import com.jocata.externalservices.payload.PanPayload;
import com.jocata.externalservices.response.PanResponse;
import com.jocata.externalservices.service.PanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanServiceImpl implements PanService {

    @Autowired
    private PanDao panDao;

    @Override
    public PanResponse getPanInfoDetails(PanPayload payload) {

        PanResponse response = new PanResponse();
        PanDetails pan = panDao.getPanInfoDetails(payload.getPanNumber());
        response.setPanNum(pan.getPanNum());
        response.setFullName(pan.getFullName());
        response.setDob(String.valueOf(pan.getDob()));
        response.setIssueDate(String.valueOf(pan.getIssueDate()));
        response.setStatus(pan.getStatus());
        response.setEmail(pan.getEmail());
        response.setAddress(pan.getAddress());
        response.setContactNumber(pan.getContactNumber());
        return response;
    }
}
