package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class AmbitiousItem {
    private String url;
    private Double total;
    private Double scriptParseCompile;
    private Double scripting;
    private ItemNode node;
    private Double score;
    private Double duration;
    private Double startTime;
    private String groupLabel;
    private String group;
    private Boolean finished;
    private Protocol protocol;
    private ResourceType resourceType;
    private Double endTime;
    private Long transferSize;
    private Long resourceSize;
    private Long statusCode;
    private String mimeType;
    private Source source;
    private Double responseTime;
    private Long totalBytes;
    private Long cacheLifetimeMS;
    private Double wastedBytes;
    private Double cacheHitProbability;
    private DebugData debugData;

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("total")
    public Double getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(Double value) { this.total = value; }

    @JsonProperty("scriptParseCompile")
    public Double getScriptParseCompile() { return scriptParseCompile; }
    @JsonProperty("scriptParseCompile")
    public void setScriptParseCompile(Double value) { this.scriptParseCompile = value; }

    @JsonProperty("scripting")
    public Double getScripting() { return scripting; }
    @JsonProperty("scripting")
    public void setScripting(Double value) { this.scripting = value; }

    @JsonProperty("node")
    public ItemNode getNode() { return node; }
    @JsonProperty("node")
    public void setNode(ItemNode value) { this.node = value; }

    @JsonProperty("score")
    public Double getScore() { return score; }
    @JsonProperty("score")
    public void setScore(Double value) { this.score = value; }

    @JsonProperty("duration")
    public Double getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(Double value) { this.duration = value; }

    @JsonProperty("startTime")
    public Double getStartTime() { return startTime; }
    @JsonProperty("startTime")
    public void setStartTime(Double value) { this.startTime = value; }

    @JsonProperty("groupLabel")
    public String getGroupLabel() { return groupLabel; }
    @JsonProperty("groupLabel")
    public void setGroupLabel(String value) { this.groupLabel = value; }

    @JsonProperty("group")
    public String getGroup() { return group; }
    @JsonProperty("group")
    public void setGroup(String value) { this.group = value; }

    @JsonProperty("finished")
    public Boolean getFinished() { return finished; }
    @JsonProperty("finished")
    public void setFinished(Boolean value) { this.finished = value; }

    @JsonProperty("protocol")
    public Protocol getProtocol() { return protocol; }
    @JsonProperty("protocol")
    public void setProtocol(Protocol value) { this.protocol = value; }

    @JsonProperty("resourceType")
    public ResourceType getResourceType() { return resourceType; }
    @JsonProperty("resourceType")
    public void setResourceType(ResourceType value) { this.resourceType = value; }

    @JsonProperty("endTime")
    public Double getEndTime() { return endTime; }
    @JsonProperty("endTime")
    public void setEndTime(Double value) { this.endTime = value; }

    @JsonProperty("transferSize")
    public Long getTransferSize() { return transferSize; }
    @JsonProperty("transferSize")
    public void setTransferSize(Long value) { this.transferSize = value; }

    @JsonProperty("resourceSize")
    public Long getResourceSize() { return resourceSize; }
    @JsonProperty("resourceSize")
    public void setResourceSize(Long value) { this.resourceSize = value; }

    @JsonProperty("statusCode")
    public Long getStatusCode() { return statusCode; }
    @JsonProperty("statusCode")
    public void setStatusCode(Long value) { this.statusCode = value; }

    @JsonProperty("mimeType")
    public String getMIMEType() { return mimeType; }
    @JsonProperty("mimeType")
    public void setMIMEType(String value) { this.mimeType = value; }

    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }

    @JsonProperty("responseTime")
    public Double getResponseTime() { return responseTime; }
    @JsonProperty("responseTime")
    public void setResponseTime(Double value) { this.responseTime = value; }

    @JsonProperty("totalBytes")
    public Long getTotalBytes() { return totalBytes; }
    @JsonProperty("totalBytes")
    public void setTotalBytes(Long value) { this.totalBytes = value; }

    @JsonProperty("cacheLifetimeMs")
    public Long getCacheLifetimeMS() { return cacheLifetimeMS; }
    @JsonProperty("cacheLifetimeMs")
    public void setCacheLifetimeMS(Long value) { this.cacheLifetimeMS = value; }

    @JsonProperty("wastedBytes")
    public Double getWastedBytes() { return wastedBytes; }
    @JsonProperty("wastedBytes")
    public void setWastedBytes(Double value) { this.wastedBytes = value; }

    @JsonProperty("cacheHitProbability")
    public Double getCacheHitProbability() { return cacheHitProbability; }
    @JsonProperty("cacheHitProbability")
    public void setCacheHitProbability(Double value) { this.cacheHitProbability = value; }

    @JsonProperty("debugData")
    public DebugData getDebugData() { return debugData; }
    @JsonProperty("debugData")
    public void setDebugData(DebugData value) { this.debugData = value; }
}
