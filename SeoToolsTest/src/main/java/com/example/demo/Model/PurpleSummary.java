package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class PurpleSummary {
    private Double wastedMS;

    @JsonProperty("wastedMs")
    public Double getWastedMS() { return wastedMS; }
    @JsonProperty("wastedMs")
    public void setWastedMS(Double value) { this.wastedMS = value; }
}
