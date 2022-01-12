package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class LoadingExperience {
    private String id;
    private Metrics metrics;
    private String overallCategory;
    private String initialURL;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("metrics")
    public Metrics getMetrics() { return metrics; }
    @JsonProperty("metrics")
    public void setMetrics(Metrics value) { this.metrics = value; }

    @JsonProperty("overall_category")
    public String getOverallCategory() { return overallCategory; }
    @JsonProperty("overall_category")
    public void setOverallCategory(String value) { this.overallCategory = value; }

    @JsonProperty("initial_url")
    public String getInitialURL() { return initialURL; }
    @JsonProperty("initial_url")
    public void setInitialURL(String value) { this.initialURL = value; }
}
