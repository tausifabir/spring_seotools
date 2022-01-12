package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class BootupTimeDetails {
    private DetailsType type;
    private PurpleHeading[] headings;
    private PurpleSummary summary;
    private PurpleItem[] items;
    private Long overallSavingsMS;
    private Long overallSavingsBytes;

    @JsonProperty("type")
    public DetailsType getType() { return type; }
    @JsonProperty("type")
    public void setType(DetailsType value) { this.type = value; }

    @JsonProperty("headings")
    public PurpleHeading[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(PurpleHeading[] value) { this.headings = value; }

    @JsonProperty("summary")
    public PurpleSummary getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(PurpleSummary value) { this.summary = value; }

    @JsonProperty("items")
    public PurpleItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(PurpleItem[] value) { this.items = value; }

    @JsonProperty("overallSavingsMs")
    public Long getOverallSavingsMS() { return overallSavingsMS; }
    @JsonProperty("overallSavingsMs")
    public void setOverallSavingsMS(Long value) { this.overallSavingsMS = value; }

    @JsonProperty("overallSavingsBytes")
    public Long getOverallSavingsBytes() { return overallSavingsBytes; }
    @JsonProperty("overallSavingsBytes")
    public void setOverallSavingsBytes(Long value) { this.overallSavingsBytes = value; }
}
