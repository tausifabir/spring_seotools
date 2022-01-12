package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Entity {
    private EntityType type;
    private String text;
    private String url;

    @JsonProperty("type")
    public EntityType getType() { return type; }
    @JsonProperty("type")
    public void setType(EntityType value) { this.type = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
