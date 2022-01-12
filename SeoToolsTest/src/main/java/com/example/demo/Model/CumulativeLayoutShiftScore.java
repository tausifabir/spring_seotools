package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class CumulativeLayoutShiftScore {
    private Long percentile;
    private Distribution[] distributions;
    private String category;

    @JsonProperty("percentile")
    public Long getPercentile() { return percentile; }
    @JsonProperty("percentile")
    public void setPercentile(Long value) { this.percentile = value; }

    @JsonProperty("distributions")
    public Distribution[] getDistributions() { return distributions; }
    @JsonProperty("distributions")
    public void setDistributions(Distribution[] value) { this.distributions = value; }

    @JsonProperty("category")
    public String getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(String value) { this.category = value; }
}
