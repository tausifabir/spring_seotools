package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class FluffyItem {
    private ItemNode node;
    private Double responseTime;
    private String url;
    private Long wastedBytes;
    private Long totalBytes;
    private Double wastedPercent;

    @JsonProperty("node")
    public ItemNode getNode() { return node; }
    @JsonProperty("node")
    public void setNode(ItemNode value) { this.node = value; }

    @JsonProperty("responseTime")
    public Double getResponseTime() { return responseTime; }
    @JsonProperty("responseTime")
    public void setResponseTime(Double value) { this.responseTime = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("wastedBytes")
    public Long getWastedBytes() { return wastedBytes; }
    @JsonProperty("wastedBytes")
    public void setWastedBytes(Long value) { this.wastedBytes = value; }

    @JsonProperty("totalBytes")
    public Long getTotalBytes() { return totalBytes; }
    @JsonProperty("totalBytes")
    public void setTotalBytes(Long value) { this.totalBytes = value; }

    @JsonProperty("wastedPercent")
    public Double getWastedPercent() { return wastedPercent; }
    @JsonProperty("wastedPercent")
    public void setWastedPercent(Double value) { this.wastedPercent = value; }
}
