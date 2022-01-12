package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class The2414 {
    private Request request;

    @JsonProperty("request")
    public Request getRequest() { return request; }
    @JsonProperty("request")
    public void setRequest(Request value) { this.request = value; }
}
