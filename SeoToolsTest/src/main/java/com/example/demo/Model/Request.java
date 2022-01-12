package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Request {
    private Double startTime;
    private Double endTime;
    private Long transferSize;
    private Double responseReceivedTime;
    private String url;

    @JsonProperty("startTime")
    public Double getStartTime() { return startTime; }
    @JsonProperty("startTime")
    public void setStartTime(Double value) { this.startTime = value; }

    @JsonProperty("endTime")
    public Double getEndTime() { return endTime; }
    @JsonProperty("endTime")
    public void setEndTime(Double value) { this.endTime = value; }

    @JsonProperty("transferSize")
    public Long getTransferSize() { return transferSize; }
    @JsonProperty("transferSize")
    public void setTransferSize(Long value) { this.transferSize = value; }

    @JsonProperty("responseReceivedTime")
    public Double getResponseReceivedTime() { return responseReceivedTime; }
    @JsonProperty("responseReceivedTime")
    public void setResponseReceivedTime(Double value) { this.responseReceivedTime = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
