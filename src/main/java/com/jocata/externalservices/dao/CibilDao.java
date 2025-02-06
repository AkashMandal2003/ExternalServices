package com.jocata.externalservices.dao;

import com.jocata.externalservices.entity.CibilDetails;

import java.util.List;

public interface CibilDao {

    List<CibilDetails> getCibilDetails(String panNumber);
}
