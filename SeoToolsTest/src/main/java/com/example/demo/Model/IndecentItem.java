package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class IndecentItem {
    private Double wastedBytes;
    private String url;
    private Long totalBytes;
    private SubItems subItems;
    private Long wastedWebpBytes;
    private Boolean isCrossOrigin;
    private Boolean fromProtocol;
    private Entity entity;
    private Long transferSize;
    private Double mainThreadTime;
    private Double blockingTime;
    private Long cacheLifetimeMS;
    private Double cacheHitProbability;
    private DebugData debugData;

    @JsonProperty("wastedBytes")
    public Double getWastedBytes() { return wastedBytes; }
    @JsonProperty("wastedBytes")
    public void setWastedBytes(Double value) { this.wastedBytes = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("totalBytes")
    public Long getTotalBytes() { return totalBytes; }
    @JsonProperty("totalBytes")
    public void setTotalBytes(Long value) { this.totalBytes = value; }

    @JsonProperty("subItems")
    public SubItems getSubItems() { return subItems; }
    @JsonProperty("subItems")
    public void setSubItems(SubItems value) { this.subItems = value; }

    @JsonProperty("wastedWebpBytes")
    public Long getWastedWebpBytes() { return wastedWebpBytes; }
    @JsonProperty("wastedWebpBytes")
    public void setWastedWebpBytes(Long value) { this.wastedWebpBytes = value; }

    @JsonProperty("isCrossOrigin")
    public Boolean getIsCrossOrigin() { return isCrossOrigin; }
    @JsonProperty("isCrossOrigin")
    public void setIsCrossOrigin(Boolean value) { this.isCrossOrigin = value; }

    @JsonProperty("fromProtocol")
    public Boolean getFromProtocol() { return fromProtocol; }
    @JsonProperty("fromProtocol")
    public void setFromProtocol(Boolean value) { this.fromProtocol = value; }

    @JsonProperty("entity")
    public Entity getEntity() { return entity; }
    @JsonProperty("entity")
    public void setEntity(Entity value) { this.entity = value; }

    @JsonProperty("transferSize")
    public Long getTransferSize() { return transferSize; }
    @JsonProperty("transferSize")
    public void setTransferSize(Long value) { this.transferSize = value; }

    @JsonProperty("mainThreadTime")
    public Double getMainThreadTime() { return mainThreadTime; }
    @JsonProperty("mainThreadTime")
    public void setMainThreadTime(Double value) { this.mainThreadTime = value; }

    @JsonProperty("blockingTime")
    public Double getBlockingTime() { return blockingTime; }
    @JsonProperty("blockingTime")
    public void setBlockingTime(Double value) { this.blockingTime = value; }

    @JsonProperty("cacheLifetimeMs")
    public Long getCacheLifetimeMS() { return cacheLifetimeMS; }
    @JsonProperty("cacheLifetimeMs")
    public void setCacheLifetimeMS(Long value) { this.cacheLifetimeMS = value; }

    @JsonProperty("cacheHitProbability")
    public Double getCacheHitProbability() { return cacheHitProbability; }
    @JsonProperty("cacheHitProbability")
    public void setCacheHitProbability(Double value) { this.cacheHitProbability = value; }

    @JsonProperty("debugData")
    public DebugData getDebugData() { return debugData; }
    @JsonProperty("debugData")
    public void setDebugData(DebugData value) { this.debugData = value; }
}
