package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Categories {
    private Performance performance;

    @JsonProperty("performance")
    public Performance getPerformance() { return performance; }
    @JsonProperty("performance")
    public void setPerformance(Performance value) { this.performance = value; }
}
