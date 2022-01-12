package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class FullPageScreenshot {
    private String id;
    private String title;
    private String description;
    private Long score;
    private String scoreDisplayMode;
    private FullPageScreenshotDetails details;
    private String displayValue;
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
    public Long getScore() { return score; }
    @JsonProperty("score")
    public void setScore(Long value) { this.score = value; }

    @JsonProperty("scoreDisplayMode")
    public String getScoreDisplayMode() { return scoreDisplayMode; }
    @JsonProperty("scoreDisplayMode")
    public void setScoreDisplayMode(String value) { this.scoreDisplayMode = value; }

    @JsonProperty("details")
    public FullPageScreenshotDetails getDetails() { return details; }
    @JsonProperty("details")
    public void setDetails(FullPageScreenshotDetails value) { this.details = value; }

    @JsonProperty("displayValue")
    public String getDisplayValue() { return displayValue; }
    @JsonProperty("displayValue")
    public void setDisplayValue(String value) { this.displayValue = value; }

    @JsonProperty("warnings")
    public Object[] getWarnings() { return warnings; }
    @JsonProperty("warnings")
    public void setWarnings(Object[] value) { this.warnings = value; }
}
