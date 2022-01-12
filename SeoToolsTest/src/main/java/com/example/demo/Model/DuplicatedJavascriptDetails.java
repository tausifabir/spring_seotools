package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class DuplicatedJavascriptDetails {
    private Long overallSavingsMS;
    private Double overallSavingsBytes;
    private StickyHeading[] headings;
    private DetailsType type;
    private IndecentItem[] items;
    private FluffySummary summary;

    @JsonProperty("overallSavingsMs")
    public Long getOverallSavingsMS() { return overallSavingsMS; }
    @JsonProperty("overallSavingsMs")
    public void setOverallSavingsMS(Long value) { this.overallSavingsMS = value; }

    @JsonProperty("overallSavingsBytes")
    public Double getOverallSavingsBytes() { return overallSavingsBytes; }
    @JsonProperty("overallSavingsBytes")
    public void setOverallSavingsBytes(Double value) { this.overallSavingsBytes = value; }

    @JsonProperty("headings")
    public StickyHeading[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(StickyHeading[] value) { this.headings = value; }

    @JsonProperty("type")
    public DetailsType getType() { return type; }
    @JsonProperty("type")
    public void setType(DetailsType value) { this.type = value; }

    @JsonProperty("items")
    public IndecentItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(IndecentItem[] value) { this.items = value; }

    @JsonProperty("summary")
    public FluffySummary getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(FluffySummary value) { this.summary = value; }
}
