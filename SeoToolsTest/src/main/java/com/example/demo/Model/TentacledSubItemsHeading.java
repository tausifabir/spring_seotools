package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class TentacledSubItemsHeading {
    private String key;
    private ValueTypeEnum valueType;
    private String itemType;

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }

    @JsonProperty("valueType")
    public ValueTypeEnum getValueType() { return valueType; }
    @JsonProperty("valueType")
    public void setValueType(ValueTypeEnum value) { this.valueType = value; }

    @JsonProperty("itemType")
    public String getItemType() { return itemType; }
    @JsonProperty("itemType")
    public void setItemType(String value) { this.itemType = value; }
}
