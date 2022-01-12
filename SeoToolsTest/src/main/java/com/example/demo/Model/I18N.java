package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class I18N {
    private RendererFormattedStrings rendererFormattedStrings;

    @JsonProperty("rendererFormattedStrings")
    public RendererFormattedStrings getRendererFormattedStrings() { return rendererFormattedStrings; }
    @JsonProperty("rendererFormattedStrings")
    public void setRendererFormattedStrings(RendererFormattedStrings value) { this.rendererFormattedStrings = value; }
}
