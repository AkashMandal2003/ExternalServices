package com.jocata.externalservices.service.impl;

import com.jocata.externalservices.dao.AadharDao;
import com.jocata.externalservices.entity.AadharDetails;
import com.jocata.externalservices.payload.AadharPayLoad;
import com.jocata.externalservices.response.AadharResponse;
import com.jocata.externalservices.service.AadharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AadharServiceImpl implements AadharService {

    private final AadharDao aadharDao;

    public AadharServiceImpl(AadharDao aadharDao) {
        this.aadharDao = aadharDao;
    }

    @Override
    public AadharResponse getAadharInfoDetails(AadharPayLoad payLoad) {
        AadharDetails aadhar= aadharDao.getAadharInfoDetails(payLoad.getAadharNumber());
        return getAadharResponse(aadhar);
    }

    private static AadharResponse getAadharResponse(AadharDetails aadhar) {
        AadharResponse response = new AadharResponse();
        response.setAadharNum(aadhar.getAadharNum());
        response.setDob(String.valueOf(aadhar.getDob()));
        response.setFullName(aadhar.getFullName());
        response.setIssueDate(String.valueOf(aadhar.getIssueDate()));
        response.setStatus(aadhar.getStatus());
        response.setAddress(aadhar.getAddress());
        response.setStatus(aadhar.getStatus());
        response.setEmail(aadhar.getEmail());
        response.setGender(aadhar.getGender());
        response.setContactNumber(aadhar.getContactNumber());
        return response;
    }
}
