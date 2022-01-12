package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class IndigoItem {
    private String statistic;
    private Long value;
    private ItemNode node;
    private String resourceType;
    private String label;
    private Long transferSize;
    private Long requestCount;

    @JsonProperty("statistic")
    public String getStatistic() { return statistic; }
    @JsonProperty("statistic")
    public void setStatistic(String value) { this.statistic = value; }

    @JsonProperty("value")
    public Long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(Long value) { this.value = value; }

    @JsonProperty("node")
    public ItemNode getNode() { return node; }
    @JsonProperty("node")
    public void setNode(ItemNode value) { this.node = value; }

    @JsonProperty("resourceType")
    public String getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(String value) { this.resourceType = value; }

    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("transferSize")
    public Long getTransferSize() { return transferSize; }
    @JsonProperty("transferSize")
    public void setTransferSize(Long value) { this.transferSize = value; }

    @JsonProperty("requestCount")
    public Long getRequestCount() { return requestCount; }
    @JsonProperty("requestCount")
    public void setRequestCount(Long value) { this.requestCount = value; }
}
