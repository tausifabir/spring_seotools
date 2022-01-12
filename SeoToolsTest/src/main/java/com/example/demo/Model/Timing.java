package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Timing {
    private Double total;

    @JsonProperty("total")
    public Double getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(Double value) { this.total = value; }
}
