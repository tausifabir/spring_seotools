package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class FluffyHeading {
    private String key;
    private String itemType;
    private String text;
    private String label;
    private String valueType;
    private PurpleSubItemsHeading subItemsHeading;

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

    @JsonProperty("label")
    public String getLabel() { return label; }
    @JsonProperty("label")
    public void setLabel(String value) { this.label = value; }

    @JsonProperty("valueType")
    public String getValueType() { return valueType; }
    @JsonProperty("valueType")
    public void setValueType(String value) { this.valueType = value; }

    @JsonProperty("subItemsHeading")
    public PurpleSubItemsHeading getSubItemsHeading() { return subItemsHeading; }
    @JsonProperty("subItemsHeading")
    public void setSubItemsHeading(PurpleSubItemsHeading value) { this.subItemsHeading = value; }
}
