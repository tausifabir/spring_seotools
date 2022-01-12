package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class FluffySummary {
    private Double wastedBytes;
    private Double wastedMS;

    @JsonProperty("wastedBytes")
    public Double getWastedBytes() { return wastedBytes; }
    @JsonProperty("wastedBytes")
    public void setWastedBytes(Double value) { this.wastedBytes = value; }

    @JsonProperty("wastedMs")
    public Double getWastedMS() { return wastedMS; }
    @JsonProperty("wastedMs")
    public void setWastedMS(Double value) { this.wastedMS = value; }
}
