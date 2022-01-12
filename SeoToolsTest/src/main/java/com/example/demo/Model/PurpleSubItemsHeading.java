package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class PurpleSubItemsHeading {
    private String key;
    private String valueType;

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }

    @JsonProperty("valueType")
    public String getValueType() { return valueType; }
    @JsonProperty("valueType")
    public void setValueType(String value) { this.valueType = value; }
}
