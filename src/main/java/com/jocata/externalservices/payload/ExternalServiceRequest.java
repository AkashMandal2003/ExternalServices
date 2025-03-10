package com.jocata.externalservices.payload;

import java.io.Serializable;

public class ExternalServiceRequest implements Serializable {

    private String txnId;
    private PanPayload panPayload;
    private AadharPayLoad aadharPayLoad;
    private CibilPayLoad cibilPayLoad;

    public CibilPayLoad getCibilPayLoad() {
        return cibilPayLoad;
    }

    public void setCibilPayLoad(CibilPayLoad cibilPayLoad) {
        this.cibilPayLoad = cibilPayLoad;
    }

    public AadharPayLoad getAadharPayLoad() {
        return aadharPayLoad;
    }

    public void setAadharPayLoad(AadharPayLoad aadharPayLoad) {
        this.aadharPayLoad = aadharPayLoad;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public PanPayload getPanPayload() {
        return panPayload;
    }

    public void setPanPayload(PanPayload panPayload) {
        this.panPayload = panPayload;
    }
}
