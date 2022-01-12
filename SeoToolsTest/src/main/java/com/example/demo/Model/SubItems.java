package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class SubItems {
    private SubItemsItem[] items;
    private SubItemsType type;

    @JsonProperty("items")
    public SubItemsItem[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(SubItemsItem[] value) { this.items = value; }

    @JsonProperty("type")
    public SubItemsType getType() { return type; }
    @JsonProperty("type")
    public void setType(SubItemsType value) { this.type = value; }
}
