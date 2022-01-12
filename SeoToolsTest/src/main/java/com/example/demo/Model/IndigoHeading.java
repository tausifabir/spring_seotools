package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class IndigoHeading {
    private String valueType;
    private PurpleSubItemsHeading subItemsHeading;
    private String label;
    private String key;

    @JsonProperty("valueType")
    public String getValueType() { return valueType; }
    @JsonProperty("valueType")
    public void setValueType(String value) { this.valueType = value; }

    @JsonProperty("subItemsHeading")
    public PurpleSubItemsHeading getSubItemsHeading() { return subItemsHeading; }
    @JsonProperty("subItemsHeading")
    public void setSubItemsHeading(PurpleSubItemsHeading value) { this.subItemsHeading = value; }

    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }
}
