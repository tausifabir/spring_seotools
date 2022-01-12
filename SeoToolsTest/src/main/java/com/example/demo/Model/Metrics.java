package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Metrics {
    private CumulativeLayoutShiftScore cumulativeLayoutShiftScore;
    private CumulativeLayoutShiftScore firstContentfulPaintMS;
    private CumulativeLayoutShiftScore firstInputDelayMS;
    private CumulativeLayoutShiftScore largestContentfulPaintMS;

    @JsonProperty("CUMULATIVE_LAYOUT_SHIFT_SCORE")
    public CumulativeLayoutShiftScore getCumulativeLayoutShiftScore() { return cumulativeLayoutShiftScore; }
    @JsonProperty("CUMULATIVE_LAYOUT_SHIFT_SCORE")
    public void setCumulativeLayoutShiftScore(CumulativeLayoutShiftScore value) { this.cumulativeLayoutShiftScore = value; }

    @JsonProperty("FIRST_CONTENTFUL_PAINT_MS")
    public CumulativeLayoutShiftScore getFirstContentfulPaintMS() { return firstContentfulPaintMS; }
    @JsonProperty("FIRST_CONTENTFUL_PAINT_MS")
    public void setFirstContentfulPaintMS(CumulativeLayoutShiftScore value) { this.firstContentfulPaintMS = value; }

    @JsonProperty("FIRST_INPUT_DELAY_MS")
    public CumulativeLayoutShiftScore getFirstInputDelayMS() { return firstInputDelayMS; }
    @JsonProperty("FIRST_INPUT_DELAY_MS")
    public void setFirstInputDelayMS(CumulativeLayoutShiftScore value) { this.firstInputDelayMS = value; }

    @JsonProperty("LARGEST_CONTENTFUL_PAINT_MS")
    public CumulativeLayoutShiftScore getLargestContentfulPaintMS() { return largestContentfulPaintMS; }
    @JsonProperty("LARGEST_CONTENTFUL_PAINT_MS")
    public void setLargestContentfulPaintMS(CumulativeLayoutShiftScore value) { this.largestContentfulPaintMS = value; }
}
