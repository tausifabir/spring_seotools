package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class PurpleHeading {
    private String key;
    private String itemType;
    private String text;
    private Long granularity;
    private String valueType;
    private String label;

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }

    @JsonProperty("itemType")
    public String getItemType() { return itemType; }
    @JsonProperty("itemType")
    public void setItemType(String value) { this.itemType = value; }

    @JsonProperty("text")
    public String getText() { return text; }
    @JsonProperty("text")
    public void setText(String value) { this.text = value; }

    @JsonProperty("granularity")
    public Long getGranularity() { return granularity; }
    @JsonProperty("granularity")
    public void setGranularity(Long value) { this.granularity = value; }

    @JsonProperty("valueType")
    public String getValueType() { return valueType; }
    @JsonProperty("valueType")
    public void setValueType(String value) { this.valueType = value; }

    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }
}
