package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class SubItemsItem {
    private String signal;
    private Source location;
    private Double mainThreadTime;
    private Double blockingTime;
    private Long transferSize;
    private String url;

    @JsonProperty("signal")
    public String getSignal() { return signal; }
    @JsonProperty("signal")
    public void setSignal(String value) { this.signal = value; }

    @JsonProperty("location")
    public Source getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(Source value) { this.location = value; }

    @JsonProperty("mainThreadTime")
    public Double getMainThreadTime() { return mainThreadTime; }
    @JsonProperty("mainThreadTime")
    public void setMainThreadTime(Double value) { this.mainThreadTime = value; }

    @JsonProperty("blockingTime")
    public Double getBlockingTime() { return blockingTime; }
    @JsonProperty("blockingTime")
    public void setBlockingTime(Double value) { this.blockingTime = value; }

    @JsonProperty("transferSize")
    public Long getTransferSize() { return transferSize; }
    @JsonProperty("transferSize")
    public void setTransferSize(Long value) { this.transferSize = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
