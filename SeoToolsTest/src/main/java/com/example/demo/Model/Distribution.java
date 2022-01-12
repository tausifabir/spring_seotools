package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Distribution {
    private Long min;
    private Long max;
    private Double proportion;

    @JsonProperty("min")
    public Long getMin() { return min; }
    @JsonProperty("min")
    public void setMin(Long value) { this.min = value; }

    @JsonProperty("max")
    public Long getMax() { return max; }
    @JsonProperty("max")
    public void setMax(Long value) { this.max = value; }

    @JsonProperty("proportion")
    public Double getProportion() { return proportion; }
    @JsonProperty("proportion")
    public void setProportion(Double value) { this.proportion = value; }
    
	@Override
	public String toString() {
		return "Distribution [min=" + min + ", max=" + max + ", proportion=" + proportion + "]";
	}
    
}
