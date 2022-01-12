package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class StickyHeading {
    private String valueType;
    private TentacledSubItemsHeading subItemsHeading;
    private String label;
    private String key;
    private String itemType;
    private String text;
    private Long granularity;
    private String displayUnit;

    @JsonProperty("valueType")
    public String getValueType() { return valueType; }
    @JsonProperty("valueType")
    public void setValueType(String value) { this.valueType = value; }

    @JsonProperty("subItemsHeading")
    public TentacledSubItemsHeading getSubItemsHeading() { return subItemsHeading; }
    @JsonProperty("subItemsHeading")
    public void setSubItemsHeading(TentacledSubItemsHeading value) { this.subItemsHeading = value; }

    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

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

    @JsonProperty("displayUnit")
    public String getDisplayUnit() { return displayUnit; }
    @JsonProperty("displayUnit")
    public void setDisplayUnit(String value) { this.displayUnit = value; }
}
