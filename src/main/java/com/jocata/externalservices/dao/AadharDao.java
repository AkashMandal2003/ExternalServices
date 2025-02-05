package com.jocata.externalservices.dao;

import com.jocata.externalservices.entity.AadharDetails;

public interface AadharDao {
    AadharDetails getAadharInfoDetails(String aadharNumber);
}
