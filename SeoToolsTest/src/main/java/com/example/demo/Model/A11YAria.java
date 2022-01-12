package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class A11YAria {
    private String title;
    private String description;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }
}
