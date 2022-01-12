package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class TentacledItem {
    private Double totalCumulativeLayoutShift;
    private Double cumulativeLayoutShiftMainFrame;
    private Long observedFirstVisualChangeTs;
    private Long observedTimeOriginTs;
    private Long observedFirstVisualChange;
    private Double observedTotalCumulativeLayoutShift;
    private Long observedLastVisualChange;
    private Long observedTraceEnd;
    private Long observedSpeedIndex;
    private Double observedCumulativeLayoutShiftMainFrame;
    private Long observedDOMContentLoadedTs;
    private Long firstContentfulPaint;
    private Long observedSpeedIndexTs;
    private Long observedFirstMeaningfulPaint;
    private Long observedLoadTs;
    private Long observedFirstMeaningfulPaintTs;
    private Double cumulativeLayoutShift;
    private Long observedFirstPaintTs;
    private Long observedDOMContentLoaded;
    private Long observedLoad;
    private Long observedTimeOrigin;
    private Long observedFirstPaint;
    private Long observedFirstContentfulPaintTs;
    private Double observedCumulativeLayoutShift;
    private Long observedFirstContentfulPaintAllFramesTs;
    private Long observedLargestContentfulPaintAllFramesTs;
    private Long largestContentfulPaint;
    private Long interactive;
    private Long observedNavigationStart;
    private Long speedIndex;
    private Long observedLargestContentfulPaintTs;
    private Long observedLargestContentfulPaint;
    private Long observedLastVisualChangeTs;
    private Long observedFirstContentfulPaintAllFrames;
    private Long firstMeaningfulPaint;
    private Long maxPotentialFID;
    private Long observedFirstContentfulPaint;
    private Long totalBlockingTime;
    private Long observedLargestContentfulPaintAllFrames;
    private Long observedNavigationStartTs;
    private Long observedTraceEndTs;
    private Boolean lcpInvalidated;

    @JsonProperty("totalCumulativeLayoutShift")
    public Double getTotalCumulativeLayoutShift() { return totalCumulativeLayoutShift; }
    @JsonProperty("totalCumulativeLayoutShift")
    public void setTotalCumulativeLayoutShift(Double value) { this.totalCumulativeLayoutShift = value; }

    @JsonProperty("cumulativeLayoutShiftMainFrame")
    public Double getCumulativeLayoutShiftMainFrame() { return cumulativeLayoutShiftMainFrame; }
    @JsonProperty("cumulativeLayoutShiftMainFrame")
    public void setCumulativeLayoutShiftMainFrame(Double value) { this.cumulativeLayoutShiftMainFrame = value; }

    @JsonProperty("observedFirstVisualChangeTs")
    public Long getObservedFirstVisualChangeTs() { return observedFirstVisualChangeTs; }
    @JsonProperty("observedFirstVisualChangeTs")
    public void setObservedFirstVisualChangeTs(Long value) { this.observedFirstVisualChangeTs = value; }

    @JsonProperty("observedTimeOriginTs")
    public Long getObservedTimeOriginTs() { return observedTimeOriginTs; }
    @JsonProperty("observedTimeOriginTs")
    public void setObservedTimeOriginTs(Long value) { this.observedTimeOriginTs = value; }

    @JsonProperty("observedFirstVisualChange")
    public Long getObservedFirstVisualChange() { return observedFirstVisualChange; }
    @JsonProperty("observedFirstVisualChange")
    public void setObservedFirstVisualChange(Long value) { this.observedFirstVisualChange = value; }

    @JsonProperty("observedTotalCumulativeLayoutShift")
    public Double getObservedTotalCumulativeLayoutShift() { return observedTotalCumulativeLayoutShift; }
    @JsonProperty("observedTotalCumulativeLayoutShift")
    public void setObservedTotalCumulativeLayoutShift(Double value) { this.observedTotalCumulativeLayoutShift = value; }

    @JsonProperty("observedLastVisualChange")
    public Long getObservedLastVisualChange() { return observedLastVisualChange; }
    @JsonProperty("observedLastVisualChange")
    public void setObservedLastVisualChange(Long value) { this.observedLastVisualChange = value; }

    @JsonProperty("observedTraceEnd")
    public Long getObservedTraceEnd() { return observedTraceEnd; }
    @JsonProperty("observedTraceEnd")
    public void setObservedTraceEnd(Long value) { this.observedTraceEnd = value; }

    @JsonProperty("observedSpeedIndex")
    public Long getObservedSpeedIndex() { return observedSpeedIndex; }
    @JsonProperty("observedSpeedIndex")
    public void setObservedSpeedIndex(Long value) { this.observedSpeedIndex = value; }

    @JsonProperty("observedCumulativeLayoutShiftMainFrame")
    public Double getObservedCumulativeLayoutShiftMainFrame() { return observedCumulativeLayoutShiftMainFrame; }
    @JsonProperty("observedCumulativeLayoutShiftMainFrame")
    public void setObservedCumulativeLayoutShiftMainFrame(Double value) { this.observedCumulativeLayoutShiftMainFrame = value; }

    @JsonProperty("observedDomContentLoadedTs")
    public Long getObservedDOMContentLoadedTs() { return observedDOMContentLoadedTs; }
    @JsonProperty("observedDomContentLoadedTs")
    public void setObservedDOMContentLoadedTs(Long value) { this.observedDOMContentLoadedTs = value; }

    @JsonProperty("firstContentfulPaint")
    public Long getFirstContentfulPaint() { return firstContentfulPaint; }
    @JsonProperty("firstContentfulPaint")
    public void setFirstContentfulPaint(Long value) { this.firstContentfulPaint = value; }

    @JsonProperty("observedSpeedIndexTs")
    public Long getObservedSpeedIndexTs() { return observedSpeedIndexTs; }
    @JsonProperty("observedSpeedIndexTs")
    public void setObservedSpeedIndexTs(Long value) { this.observedSpeedIndexTs = value; }

    @JsonProperty("observedFirstMeaningfulPaint")
    public Long getObservedFirstMeaningfulPaint() { return observedFirstMeaningfulPaint; }
    @JsonProperty("observedFirstMeaningfulPaint")
    public void setObservedFirstMeaningfulPaint(Long value) { this.observedFirstMeaningfulPaint = value; }

    @JsonProperty("observedLoadTs")
    public Long getObservedLoadTs() { return observedLoadTs; }
    @JsonProperty("observedLoadTs")
    public void setObservedLoadTs(Long value) { this.observedLoadTs = value; }

    @JsonProperty("observedFirstMeaningfulPaintTs")
    public Long getObservedFirstMeaningfulPaintTs() { return observedFirstMeaningfulPaintTs; }
    @JsonProperty("observedFirstMeaningfulPaintTs")
    public void setObservedFirstMeaningfulPaintTs(Long value) { this.observedFirstMeaningfulPaintTs = value; }

    @JsonProperty("cumulativeLayoutShift")
    public Double getCumulativeLayoutShift() { return cumulativeLayoutShift; }
    @JsonProperty("cumulativeLayoutShift")
    public void setCumulativeLayoutShift(Double value) { this.cumulativeLayoutShift = value; }

    @JsonProperty("observedFirstPaintTs")
    public Long getObservedFirstPaintTs() { return observedFirstPaintTs; }
    @JsonProperty("observedFirstPaintTs")
    public void setObservedFirstPaintTs(Long value) { this.observedFirstPaintTs = value; }

    @JsonProperty("observedDomContentLoaded")
    public Long getObservedDOMContentLoaded() { return observedDOMContentLoaded; }
    @JsonProperty("observedDomContentLoaded")
    public void setObservedDOMContentLoaded(Long value) { this.observedDOMContentLoaded = value; }

    @JsonProperty("observedLoad")
    public Long getObservedLoad() { return observedLoad; }
    @JsonProperty("observedLoad")
    public void setObservedLoad(Long value) { this.observedLoad = value; }

    @JsonProperty("observedTimeOrigin")
    public Long getObservedTimeOrigin() { return observedTimeOrigin; }
    @JsonProperty("observedTimeOrigin")
    public void setObservedTimeOrigin(Long value) { this.observedTimeOrigin = value; }

    @JsonProperty("observedFirstPaint")
    public Long getObservedFirstPaint() { return observedFirstPaint; }
    @JsonProperty("observedFirstPaint")
    public void setObservedFirstPaint(Long value) { this.observedFirstPaint = value; }

    @JsonProperty("observedFirstContentfulPaintTs")
    public Long getObservedFirstContentfulPaintTs() { return observedFirstContentfulPaintTs; }
    @JsonProperty("observedFirstContentfulPaintTs")
    public void setObservedFirstContentfulPaintTs(Long value) { this.observedFirstContentfulPaintTs = value; }

    @JsonProperty("observedCumulativeLayoutShift")
    public Double getObservedCumulativeLayoutShift() { return observedCumulativeLayoutShift; }
    @JsonProperty("observedCumulativeLayoutShift")
    public void setObservedCumulativeLayoutShift(Double value) { this.observedCumulativeLayoutShift = value; }

    @JsonProperty("observedFirstContentfulPaintAllFramesTs")
    public Long getObservedFirstContentfulPaintAllFramesTs() { return observedFirstContentfulPaintAllFramesTs; }
    @JsonProperty("observedFirstContentfulPaintAllFramesTs")
    public void setObservedFirstContentfulPaintAllFramesTs(Long value) { this.observedFirstContentfulPaintAllFramesTs = value; }

    @JsonProperty("observedLargestContentfulPaintAllFramesTs")
    public Long getObservedLargestContentfulPaintAllFramesTs() { return observedLargestContentfulPaintAllFramesTs; }
    @JsonProperty("observedLargestContentfulPaintAllFramesTs")
    public void setObservedLargestContentfulPaintAllFramesTs(Long value) { this.observedLargestContentfulPaintAllFramesTs = value; }

    @JsonProperty("largestContentfulPaint")
    public Long getLargestContentfulPaint() { return largestContentfulPaint; }
    @JsonProperty("largestContentfulPaint")
    public void setLargestContentfulPaint(Long value) { this.largestContentfulPaint = value; }

    @JsonProperty("interactive")
    public Long getInteractive() { return interactive; }
    @JsonProperty("interactive")
    public void setInteractive(Long value) { this.interactive = value; }

    @JsonProperty("observedNavigationStart")
    public Long getObservedNavigationStart() { return observedNavigationStart; }
    @JsonProperty("observedNavigationStart")
    public void setObservedNavigationStart(Long value) { this.observedNavigationStart = value; }

    @JsonProperty("speedIndex")
    public Long getSpeedIndex() { return speedIndex; }
    @JsonProperty("speedIndex")
    public void setSpeedIndex(Long value) { this.speedIndex = value; }

    @JsonProperty("observedLargestContentfulPaintTs")
    public Long getObservedLargestContentfulPaintTs() { return observedLargestContentfulPaintTs; }
    @JsonProperty("observedLargestContentfulPaintTs")
    public void setObservedLargestContentfulPaintTs(Long value) { this.observedLargestContentfulPaintTs = value; }

    @JsonProperty("observedLargestContentfulPaint")
    public Long getObservedLargestContentfulPaint() { return observedLargestContentfulPaint; }
    @JsonProperty("observedLargestContentfulPaint")
    public void setObservedLargestContentfulPaint(Long value) { this.observedLargestContentfulPaint = value; }

    @JsonProperty("observedLastVisualChangeTs")
    public Long getObservedLastVisualChangeTs() { return observedLastVisualChangeTs; }
    @JsonProperty("observedLastVisualChangeTs")
    public void setObservedLastVisualChangeTs(Long value) { this.observedLastVisualChangeTs = value; }

    @JsonProperty("observedFirstContentfulPaintAllFrames")
    public Long getObservedFirstContentfulPaintAllFrames() { return observedFirstContentfulPaintAllFrames; }
    @JsonProperty("observedFirstContentfulPaintAllFrames")
    public void setObservedFirstContentfulPaintAllFrames(Long value) { this.observedFirstContentfulPaintAllFrames = value; }

    @JsonProperty("firstMeaningfulPaint")
    public Long getFirstMeaningfulPaint() { return firstMeaningfulPaint; }
    @JsonProperty("firstMeaningfulPaint")
    public void setFirstMeaningfulPaint(Long value) { this.firstMeaningfulPaint = value; }

    @JsonProperty("maxPotentialFID")
    public Long getMaxPotentialFID() { return maxPotentialFID; }
    @JsonProperty("maxPotentialFID")
    public void setMaxPotentialFID(Long value) { this.maxPotentialFID = value; }

    @JsonProperty("observedFirstContentfulPaint")
    public Long getObservedFirstContentfulPaint() { return observedFirstContentfulPaint; }
    @JsonProperty("observedFirstContentfulPaint")
    public void setObservedFirstContentfulPaint(Long value) { this.observedFirstContentfulPaint = value; }

    @JsonProperty("totalBlockingTime")
    public Long getTotalBlockingTime() { return totalBlockingTime; }
    @JsonProperty("totalBlockingTime")
    public void setTotalBlockingTime(Long value) { this.totalBlockingTime = value; }

    @JsonProperty("observedLargestContentfulPaintAllFrames")
    public Long getObservedLargestContentfulPaintAllFrames() { return observedLargestContentfulPaintAllFrames; }
    @JsonProperty("observedLargestContentfulPaintAllFrames")
    public void setObservedLargestContentfulPaintAllFrames(Long value) { this.observedLargestContentfulPaintAllFrames = value; }

    @JsonProperty("observedNavigationStartTs")
    public Long getObservedNavigationStartTs() { return observedNavigationStartTs; }
    @JsonProperty("observedNavigationStartTs")
    public void setObservedNavigationStartTs(Long value) { this.observedNavigationStartTs = value; }

    @JsonProperty("observedTraceEndTs")
    public Long getObservedTraceEndTs() { return observedTraceEndTs; }
    @JsonProperty("observedTraceEndTs")
    public void setObservedTraceEndTs(Long value) { this.observedTraceEndTs = value; }

    @JsonProperty("lcpInvalidated")
    public Boolean getLcpInvalidated() { return lcpInvalidated; }
    @JsonProperty("lcpInvalidated")
    public void setLcpInvalidated(Boolean value) { this.lcpInvalidated = value; }
}
