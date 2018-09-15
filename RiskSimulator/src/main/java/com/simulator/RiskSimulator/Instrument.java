package com.simulator.RiskSimulator;


import org.springframework.data.annotation.Id;


public class Instrument {

    @Id
    private String id;
    private String isin;
    private String currency;

    public String getId() {
        return id;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
