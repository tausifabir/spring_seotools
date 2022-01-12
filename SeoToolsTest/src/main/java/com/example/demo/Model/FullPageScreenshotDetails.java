package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class FullPageScreenshotDetails {
    private String type;
    private Screenshot screenshot;
    private Map<String, NodeValue> nodes;
    private CunningItem[] items;
    private TentacledHeading[] headings;
    private Long overallSavingsMS;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("screenshot")
    public Screenshot getScreenshot() { return screenshot; }
    @JsonProperty("screenshot")
    public void setScreenshot(Screenshot value) { this.screenshot = value; }

    @JsonProperty("nodes")
    public Map<String, NodeValue> getNodes() { return nodes; }
    @JsonProperty("nodes")
    public void setNodes(Map<String, NodeValue> value) { this.nodes = value; }

    @JsonProperty("items")
    public CunningItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(CunningItem[] value) { this.items = value; }

    @JsonProperty("headings")
    public TentacledHeading[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(TentacledHeading[] value) { this.headings = value; }

    @JsonProperty("overallSavingsMs")
    public Long getOverallSavingsMS() { return overallSavingsMS; }
    @JsonProperty("overallSavingsMs")
    public void setOverallSavingsMS(Long value) { this.overallSavingsMS = value; }
}
