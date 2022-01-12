package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Source {
    private ValueTypeEnum type;
    private Long line;
    private Long column;
    private URLProvider urlProvider;
    private String url;

    @JsonProperty("type")
    public ValueTypeEnum getType() { return type; }
    @JsonProperty("type")
    public void setType(ValueTypeEnum value) { this.type = value; }

    @JsonProperty("line")
    public Long getLine() { return line; }
    @JsonProperty("line")
    public void setLine(Long value) { this.line = value; }

    @JsonProperty("column")
    public Long getColumn() { return column; }
    @JsonProperty("column")
    public void setColumn(Long value) { this.column = value; }

    @JsonProperty("urlProvider")
    public URLProvider getURLProvider() { return urlProvider; }
    @JsonProperty("urlProvider")
    public void setURLProvider(URLProvider value) { this.urlProvider = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
