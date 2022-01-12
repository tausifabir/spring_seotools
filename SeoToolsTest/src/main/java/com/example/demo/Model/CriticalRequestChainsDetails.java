package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class CriticalRequestChainsDetails {
    private LongestChain longestChain;
    private String type;
    private Chains chains;
    private FluffyHeading[] headings;
    private FluffyItem[] items;
    private Double overallSavingsMS;
    private Long overallSavingsBytes;

    @JsonProperty("longestChain")
    public LongestChain getLongestChain() { return longestChain; }
    @JsonProperty("longestChain")
    public void setLongestChain(LongestChain value) { this.longestChain = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("chains")
    public Chains getChains() { return chains; }
    @JsonProperty("chains")
    public void setChains(Chains value) { this.chains = value; }

    @JsonProperty("headings")
    public FluffyHeading[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(FluffyHeading[] value) { this.headings = value; }

    @JsonProperty("items")
    public FluffyItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(FluffyItem[] value) { this.items = value; }

    @JsonProperty("overallSavingsMs")
    public Double getOverallSavingsMS() { return overallSavingsMS; }
    @JsonProperty("overallSavingsMs")
    public void setOverallSavingsMS(Double value) { this.overallSavingsMS = value; }

    @JsonProperty("overallSavingsBytes")
    public Long getOverallSavingsBytes() { return overallSavingsBytes; }
    @JsonProperty("overallSavingsBytes")
    public void setOverallSavingsBytes(Long value) { this.overallSavingsBytes = value; }
}
