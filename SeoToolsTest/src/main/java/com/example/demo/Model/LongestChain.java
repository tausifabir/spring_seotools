package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class LongestChain {
    private Long length;
    private Long transferSize;
    private Double duration;

    @JsonProperty("length")
    public Long getLength() { return length; }
    @JsonProperty("length")
    public void setLength(Long value) { this.length = value; }

    @JsonProperty("transferSize")
    public Long getTransferSize() { return transferSize; }
    @JsonProperty("transferSize")
    public void setTransferSize(Long value) { this.transferSize = value; }

    @JsonProperty("duration")
    public Double getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(Double value) { this.duration = value; }
}
