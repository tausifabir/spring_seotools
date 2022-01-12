package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class CumulativeLayoutShiftDetails {
    private String type;
    private TentacledItem[] items;
    private Object[] headings;
    private Long overallSavingsMS;
    private Long overallSavingsBytes;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("items")
    public TentacledItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(TentacledItem[] value) { this.items = value; }

    @JsonProperty("headings")
    public Object[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(Object[] value) { this.headings = value; }

    @JsonProperty("overallSavingsMs")
    public Long getOverallSavingsMS() { return overallSavingsMS; }
    @JsonProperty("overallSavingsMs")
    public void setOverallSavingsMS(Long value) { this.overallSavingsMS = value; }

    @JsonProperty("overallSavingsBytes")
    public Long getOverallSavingsBytes() { return overallSavingsBytes; }
    @JsonProperty("overallSavingsBytes")
    public void setOverallSavingsBytes(Long value) { this.overallSavingsBytes = value; }
}
