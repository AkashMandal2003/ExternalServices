package com.jocata.externalservices.dao;

import com.jocata.externalservices.entity.PanDetails;

public interface PanDao {

    PanDetails getPanInfoDetails(String panNumber);
}
