package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class NodeValue {
    private Long bottom;
    private Long width;
    private Long left;
    private Long top;
    private Long right;
    private Long height;

    @JsonProperty("bottom")
    public Long getBottom() { return bottom; }
    @JsonProperty("bottom")
    public void setBottom(Long value) { this.bottom = value; }

    @JsonProperty("width")
    public Long getWidth() { return width; }
    @JsonProperty("width")
    public void setWidth(Long value) { this.width = value; }

    @JsonProperty("left")
    public Long getLeft() { return left; }
    @JsonProperty("left")
    public void setLeft(Long value) { this.left = value; }

    @JsonProperty("top")
    public Long getTop() { return top; }
    @JsonProperty("top")
    public void setTop(Long value) { this.top = value; }

    @JsonProperty("right")
    public Long getRight() { return right; }
    @JsonProperty("right")
    public void setRight(Long value) { this.right = value; }

    @JsonProperty("height")
    public Long getHeight() { return height; }
    @JsonProperty("height")
    public void setHeight(Long value) { this.height = value; }
}
