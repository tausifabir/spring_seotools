package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class TentacledHeading {
    private String key;
    private String itemType;
    private String text;
    private Double granularity;
    private String displayUnit;
    private FluffySubItemsHeading subItemsHeading;

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
    public Double getGranularity() { return granularity; }
    @JsonProperty("granularity")
    public void setGranularity(Double value) { this.granularity = value; }

    @JsonProperty("displayUnit")
    public String getDisplayUnit() { return displayUnit; }
    @JsonProperty("displayUnit")
    public void setDisplayUnit(String value) { this.displayUnit = value; }

    @JsonProperty("subItemsHeading")
    public FluffySubItemsHeading getSubItemsHeading() { return subItemsHeading; }
    @JsonProperty("subItemsHeading")
    public void setSubItemsHeading(FluffySubItemsHeading value) { this.subItemsHeading = value; }
}
