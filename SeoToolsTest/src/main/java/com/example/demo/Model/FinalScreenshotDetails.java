package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class FinalScreenshotDetails {
    private String data;
    private Long timestamp;
    private Long timing;
    private String type;
    private Long overallSavingsMS;
    private HilariousItem[] items;
    private IndigoHeading[] headings;
    private Long scale;

    @JsonProperty("data")
    public String getData() { return data; }
    @JsonProperty("data")
    public void setData(String value) { this.data = value; }

    @JsonProperty("timestamp")
    public Long getTimestamp() { return timestamp; }
    @JsonProperty("timestamp")
    public void setTimestamp(Long value) { this.timestamp = value; }

    @JsonProperty("timing")
    public Long getTiming() { return timing; }
    @JsonProperty("timing")
    public void setTiming(Long value) { this.timing = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("overallSavingsMs")
    public Long getOverallSavingsMS() { return overallSavingsMS; }
    @JsonProperty("overallSavingsMs")
    public void setOverallSavingsMS(Long value) { this.overallSavingsMS = value; }

    @JsonProperty("items")
    public HilariousItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(HilariousItem[] value) { this.items = value; }

    @JsonProperty("headings")
    public IndigoHeading[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(IndigoHeading[] value) { this.headings = value; }

    @JsonProperty("scale")
    public Long getScale() { return scale; }
    @JsonProperty("scale")
    public void setScale(Long value) { this.scale = value; }
}
