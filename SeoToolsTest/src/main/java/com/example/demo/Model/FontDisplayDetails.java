package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class FontDisplayDetails {
    private DetailsType type;
    private IndecentHeading[] headings;
    private FluffySummary summary;
    private AmbitiousItem[] items;
    private Double overallSavingsMS;

    @JsonProperty("type")
    public DetailsType getType() { return type; }
    @JsonProperty("type")
    public void setType(DetailsType value) { this.type = value; }

    @JsonProperty("headings")
    public IndecentHeading[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(IndecentHeading[] value) { this.headings = value; }

    @JsonProperty("summary")
    public FluffySummary getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(FluffySummary value) { this.summary = value; }

    @JsonProperty("items")
    public AmbitiousItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(AmbitiousItem[] value) { this.items = value; }

    @JsonProperty("overallSavingsMs")
    public Double getOverallSavingsMS() { return overallSavingsMS; }
    @JsonProperty("overallSavingsMs")
    public void setOverallSavingsMS(Double value) { this.overallSavingsMS = value; }
}
