package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class FluffySubItemsHeading {
    private String itemType;
    private String key;

    @JsonProperty("itemType")
    public String getItemType() { return itemType; }
    @JsonProperty("itemType")
    public void setItemType(String value) { this.itemType = value; }

    @JsonProperty("key")
    public String getKey() { return key; }
    @JsonProperty("key")
    public void setKey(String value) { this.key = value; }
}
