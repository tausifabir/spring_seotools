package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class DiagnosticsDetails {
    private StickyItem[] items;
    private String type;
    private TentacledHeading[] headings;
    private NodeElement[] nodes;

    @JsonProperty("items")
    public StickyItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(StickyItem[] value) { this.items = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("headings")
    public TentacledHeading[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(TentacledHeading[] value) { this.headings = value; }

    @JsonProperty("nodes")
    public NodeElement[] getNodes() { return nodes; }
    @JsonProperty("nodes")
    public void setNodes(NodeElement[] value) { this.nodes = value; }
}
