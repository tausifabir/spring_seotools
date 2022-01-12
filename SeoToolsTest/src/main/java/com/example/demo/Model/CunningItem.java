package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class CunningItem {
    private Double startTime;
    private String name;
    private String timingType;

    @JsonProperty("startTime")
    public Double getStartTime() { return startTime; }
    @JsonProperty("startTime")
    public void setStartTime(Double value) { this.startTime = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("timingType")
    public String getTimingType() { return timingType; }
    @JsonProperty("timingType")
    public void setTimingType(String value) { this.timingType = value; }
}
