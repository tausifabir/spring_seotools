package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class The2420 {
    private Request request;
    private Map<String, The2414> children;

    @JsonProperty("request")
    public Request getRequest() { return request; }
    @JsonProperty("request")
    public void setRequest(Request value) { this.request = value; }

    @JsonProperty("children")
    public Map<String, The2414> getChildren() { return children; }
    @JsonProperty("children")
    public void setChildren(Map<String, The2414> value) { this.children = value; }
}
