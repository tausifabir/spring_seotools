package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class ConfigSettings {
    private String emulatedFormFactor;
    private String formFactor;
    private String locale;
    private String[] onlyCategories;
    private String channel;

    @JsonProperty("emulatedFormFactor")
    public String getEmulatedFormFactor() { return emulatedFormFactor; }
    @JsonProperty("emulatedFormFactor")
    public void setEmulatedFormFactor(String value) { this.emulatedFormFactor = value; }

    @JsonProperty("formFactor")
    public String getFormFactor() { return formFactor; }
    @JsonProperty("formFactor")
    public void setFormFactor(String value) { this.formFactor = value; }

    @JsonProperty("locale")
    public String getLocale() { return locale; }
    @JsonProperty("locale")
    public void setLocale(String value) { this.locale = value; }

    @JsonProperty("onlyCategories")
    public String[] getOnlyCategories() { return onlyCategories; }
    @JsonProperty("onlyCategories")
    public void setOnlyCategories(String[] value) { this.onlyCategories = value; }

    @JsonProperty("channel")
    public String getChannel() { return channel; }
    @JsonProperty("channel")
    public void setChannel(String value) { this.channel = value; }
}
