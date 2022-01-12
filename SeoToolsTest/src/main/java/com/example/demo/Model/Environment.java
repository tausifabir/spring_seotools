package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Environment {
    private String networkUserAgent;
    private String hostUserAgent;
    private Double benchmarkIndex;

    @JsonProperty("networkUserAgent")
    public String getNetworkUserAgent() { return networkUserAgent; }
    @JsonProperty("networkUserAgent")
    public void setNetworkUserAgent(String value) { this.networkUserAgent = value; }

    @JsonProperty("hostUserAgent")
    public String getHostUserAgent() { return hostUserAgent; }
    @JsonProperty("hostUserAgent")
    public void setHostUserAgent(String value) { this.hostUserAgent = value; }

    @JsonProperty("benchmarkIndex")
    public Double getBenchmarkIndex() { return benchmarkIndex; }
    @JsonProperty("benchmarkIndex")
    public void setBenchmarkIndex(Double value) { this.benchmarkIndex = value; }
}
