package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class NodeElement {
    private String name;
    private Long resourceBytes;
    private Long unusedBytes;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("resourceBytes")
    public Long getResourceBytes() { return resourceBytes; }
    @JsonProperty("resourceBytes")
    public void setResourceBytes(Long value) { this.resourceBytes = value; }

    @JsonProperty("unusedBytes")
    public Long getUnusedBytes() { return unusedBytes; }
    @JsonProperty("unusedBytes")
    public void setUnusedBytes(Long value) { this.unusedBytes = value; }
}
