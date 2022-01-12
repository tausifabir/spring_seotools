package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class CriticalRequestChains {
    private String id;
    private String title;
    private String description;
    private Double score;
    private String scoreDisplayMode;
    private String displayValue;
    private CriticalRequestChainsDetails details;
    private Double numericValue;
    private String numericUnit;
    private Object[] warnings;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("score")
    public Double getScore() { return score; }
    @JsonProperty("score")
    public void setScore(Double value) { this.score = value; }

    @JsonProperty("scoreDisplayMode")
    public String getScoreDisplayMode() { return scoreDisplayMode; }
    @JsonProperty("scoreDisplayMode")
    public void setScoreDisplayMode(String value) { this.scoreDisplayMode = value; }

    @JsonProperty("displayValue")
    public String getDisplayValue() { return displayValue; }
    @JsonProperty("displayValue")
    public void setDisplayValue(String value) { this.displayValue = value; }

    @JsonProperty("details")
    public CriticalRequestChainsDetails getDetails() { return details; }
    @JsonProperty("details")
    public void setDetails(CriticalRequestChainsDetails value) { this.details = value; }

    @JsonProperty("numericValue")
    public Double getNumericValue() { return numericValue; }
    @JsonProperty("numericValue")
    public void setNumericValue(Double value) { this.numericValue = value; }

    @JsonProperty("numericUnit")
    public String getNumericUnit() { return numericUnit; }
    @JsonProperty("numericUnit")
    public void setNumericUnit(String value) { this.numericUnit = value; }

    @JsonProperty("warnings")
    public Object[] getWarnings() { return warnings; }
    @JsonProperty("warnings")
    public void setWarnings(Object[] value) { this.warnings = value; }
}
