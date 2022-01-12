package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class StickyItem {
    private Double throughput;
    private Long totalByteWeight;
    private Long numTasks;
    private Long numStylesheets;
    private Long numTasksOver50MS;
    private Long numFonts;
    private Long numTasksOver100MS;
    private Double maxRtt;
    private Long numRequests;
    private Object maxServerLatency;
    private Long numScripts;
    private Long numTasksOver25MS;
    private Long numTasksOver500MS;
    private Long numTasksOver10MS;
    private Double rtt;
    private Long mainDocumentTransferSize;
    private Double totalTaskTime;
    private Double startTime;
    private Double duration;
    private Source source;

    @JsonProperty("throughput")
    public Double getThroughput() { return throughput; }
    @JsonProperty("throughput")
    public void setThroughput(Double value) { this.throughput = value; }

    @JsonProperty("totalByteWeight")
    public Long getTotalByteWeight() { return totalByteWeight; }
    @JsonProperty("totalByteWeight")
    public void setTotalByteWeight(Long value) { this.totalByteWeight = value; }

    @JsonProperty("numTasks")
    public Long getNumTasks() { return numTasks; }
    @JsonProperty("numTasks")
    public void setNumTasks(Long value) { this.numTasks = value; }

    @JsonProperty("numStylesheets")
    public Long getNumStylesheets() { return numStylesheets; }
    @JsonProperty("numStylesheets")
    public void setNumStylesheets(Long value) { this.numStylesheets = value; }

    @JsonProperty("numTasksOver50ms")
    public Long getNumTasksOver50MS() { return numTasksOver50MS; }
    @JsonProperty("numTasksOver50ms")
    public void setNumTasksOver50MS(Long value) { this.numTasksOver50MS = value; }

    @JsonProperty("numFonts")
    public Long getNumFonts() { return numFonts; }
    @JsonProperty("numFonts")
    public void setNumFonts(Long value) { this.numFonts = value; }

    @JsonProperty("numTasksOver100ms")
    public Long getNumTasksOver100MS() { return numTasksOver100MS; }
    @JsonProperty("numTasksOver100ms")
    public void setNumTasksOver100MS(Long value) { this.numTasksOver100MS = value; }

    @JsonProperty("maxRtt")
    public Double getMaxRtt() { return maxRtt; }
    @JsonProperty("maxRtt")
    public void setMaxRtt(Double value) { this.maxRtt = value; }

    @JsonProperty("numRequests")
    public Long getNumRequests() { return numRequests; }
    @JsonProperty("numRequests")
    public void setNumRequests(Long value) { this.numRequests = value; }

    @JsonProperty("maxServerLatency")
    public Object getMaxServerLatency() { return maxServerLatency; }
    @JsonProperty("maxServerLatency")
    public void setMaxServerLatency(Object value) { this.maxServerLatency = value; }

    @JsonProperty("numScripts")
    public Long getNumScripts() { return numScripts; }
    @JsonProperty("numScripts")
    public void setNumScripts(Long value) { this.numScripts = value; }

    @JsonProperty("numTasksOver25ms")
    public Long getNumTasksOver25MS() { return numTasksOver25MS; }
    @JsonProperty("numTasksOver25ms")
    public void setNumTasksOver25MS(Long value) { this.numTasksOver25MS = value; }

    @JsonProperty("numTasksOver500ms")
    public Long getNumTasksOver500MS() { return numTasksOver500MS; }
    @JsonProperty("numTasksOver500ms")
    public void setNumTasksOver500MS(Long value) { this.numTasksOver500MS = value; }

    @JsonProperty("numTasksOver10ms")
    public Long getNumTasksOver10MS() { return numTasksOver10MS; }
    @JsonProperty("numTasksOver10ms")
    public void setNumTasksOver10MS(Long value) { this.numTasksOver10MS = value; }

    @JsonProperty("rtt")
    public Double getRtt() { return rtt; }
    @JsonProperty("rtt")
    public void setRtt(Double value) { this.rtt = value; }

    @JsonProperty("mainDocumentTransferSize")
    public Long getMainDocumentTransferSize() { return mainDocumentTransferSize; }
    @JsonProperty("mainDocumentTransferSize")
    public void setMainDocumentTransferSize(Long value) { this.mainDocumentTransferSize = value; }

    @JsonProperty("totalTaskTime")
    public Double getTotalTaskTime() { return totalTaskTime; }
    @JsonProperty("totalTaskTime")
    public void setTotalTaskTime(Double value) { this.totalTaskTime = value; }

    @JsonProperty("startTime")
    public Double getStartTime() { return startTime; }
    @JsonProperty("startTime")
    public void setStartTime(Double value) { this.startTime = value; }

    @JsonProperty("duration")
    public Double getDuration() { return duration; }
    @JsonProperty("duration")
    public void setDuration(Double value) { this.duration = value; }

    @JsonProperty("source")
    public Source getSource() { return source; }
    @JsonProperty("source")
    public void setSource(Source value) { this.source = value; }
}
