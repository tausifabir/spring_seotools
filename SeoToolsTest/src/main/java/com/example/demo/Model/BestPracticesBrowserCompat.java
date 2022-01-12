package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class BestPracticesBrowserCompat {
    private String title;

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }
}
