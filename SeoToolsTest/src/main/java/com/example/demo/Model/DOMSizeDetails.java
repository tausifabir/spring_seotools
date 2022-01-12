package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class DOMSizeDetails {
    private IndigoItem[] items;
    private DetailsType type;
    private TentacledHeading[] headings;

    @JsonProperty("items")
    public IndigoItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(IndigoItem[] value) { this.items = value; }

    @JsonProperty("type")
    public DetailsType getType() { return type; }
    @JsonProperty("type")
    public void setType(DetailsType value) { this.type = value; }

    @JsonProperty("headings")
    public TentacledHeading[] getHeadings() { return headings; }
    @JsonProperty("headings")
    public void setHeadings(TentacledHeading[] value) { this.headings = value; }
}
