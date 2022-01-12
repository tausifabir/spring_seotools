package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class ItemNode {
    private String path;
    private String selector;
    private String type;
    private String snippet;
    private String nodeLabel;
    private NodeValue boundingRect;
    private String lhID;

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("selector")
    public String getSelector() { return selector; }
    @JsonProperty("selector")
    public void setSelector(String value) { this.selector = value; }

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("snippet")
    public String getSnippet() { return snippet; }
    @JsonProperty("snippet")
    public void setSnippet(String value) { this.snippet = value; }

    @JsonProperty("nodeLabel")
    public String getNodeLabel() { return nodeLabel; }
    @JsonProperty("nodeLabel")
    public void setNodeLabel(String value) { this.nodeLabel = value; }

    @JsonProperty("boundingRect")
    public NodeValue getBoundingRect() { return boundingRect; }
    @JsonProperty("boundingRect")
    public void setBoundingRect(NodeValue value) { this.boundingRect = value; }

    @JsonProperty("lhId")
    public String getLhID() { return lhID; }
    @JsonProperty("lhId")
    public void setLhID(String value) { this.lhID = value; }
}
