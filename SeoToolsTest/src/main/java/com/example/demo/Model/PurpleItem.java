package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class PurpleItem {
    private String url;
    private Double total;
    private Double scriptParseCompile;
    private Double scripting;
    private Double duration;
    private String groupLabel;
    private String group;
    private Long totalBytes;
    private Long wastedBytes;
    private Boolean isCrossOrigin;
    private Boolean fromProtocol;

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

    @JsonProperty("duration")
    public Double getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(Double value) { this.duration = value; }

    @JsonProperty("groupLabel")
    public String getGroupLabel() { return groupLabel; }
    @JsonProperty("groupLabel")
    public void setGroupLabel(String value) { this.groupLabel = value; }

    @JsonProperty("group")
    public String getGroup() { return group; }
    @JsonProperty("group")
    public void setGroup(String value) { this.group = value; }

    @JsonProperty("totalBytes")
    public Long getTotalBytes() { return totalBytes; }
    @JsonProperty("totalBytes")
    public void setTotalBytes(Long value) { this.totalBytes = value; }

    @JsonProperty("wastedBytes")
    public Long getWastedBytes() { return wastedBytes; }
    @JsonProperty("wastedBytes")
    public void setWastedBytes(Long value) { this.wastedBytes = value; }

    @JsonProperty("isCrossOrigin")
    public Boolean getIsCrossOrigin() { return isCrossOrigin; }
    @JsonProperty("isCrossOrigin")
    public void setIsCrossOrigin(Boolean value) { this.isCrossOrigin = value; }

    @JsonProperty("fromProtocol")
    public Boolean getFromProtocol() { return fromProtocol; }
    @JsonProperty("fromProtocol")
    public void setFromProtocol(Boolean value) { this.fromProtocol = value; }
}
