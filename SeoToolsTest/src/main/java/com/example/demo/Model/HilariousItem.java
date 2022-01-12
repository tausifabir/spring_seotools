package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class HilariousItem {
    private String url;
    private Long wastedMS;
    private Long totalBytes;
    private Long timing;
    private Double timestamp;
    private String data;

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }

    @JsonProperty("wastedMs")
    public Long getWastedMS() { return wastedMS; }
    @JsonProperty("wastedMs")
    public void setWastedMS(Long value) { this.wastedMS = value; }

    @JsonProperty("totalBytes")
    public Long getTotalBytes() { return totalBytes; }
    @JsonProperty("totalBytes")
    public void setTotalBytes(Long value) { this.totalBytes = value; }

    @JsonProperty("timing")
    public Long getTiming() { return timing; }
    @JsonProperty("timing")
    public void setTiming(Long value) { this.timing = value; }

    @JsonProperty("timestamp")
    public Double getTimestamp() { return timestamp; }
    @JsonProperty("timestamp")
    public void setTimestamp(Double value) { this.timestamp = value; }

    @JsonProperty("data")
    public String getData() { return data; }
    @JsonProperty("data")
    public void setData(String value) { this.data = value; }
}
