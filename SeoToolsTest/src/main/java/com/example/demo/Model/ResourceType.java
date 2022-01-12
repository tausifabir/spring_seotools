package com.example.demo.Model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ResourceType {
    DOCUMENT, FETCH, FONT, IMAGE, OTHER, PING, SCRIPT, STYLESHEET, XHR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DOCUMENT: return "Document";
            case FETCH: return "Fetch";
            case FONT: return "Font";
            case IMAGE: return "Image";
            case OTHER: return "Other";
            case PING: return "Ping";
            case SCRIPT: return "Script";
            case STYLESHEET: return "Stylesheet";
            case XHR: return "XHR";
        }
        return null;
    }

    @JsonCreator
    public static ResourceType forValue(String value) throws IOException {
        if (value.equals("Document")) return DOCUMENT;
        if (value.equals("Fetch")) return FETCH;
        if (value.equals("Font")) return FONT;
        if (value.equals("Image")) return IMAGE;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Ping")) return PING;
        if (value.equals("Script")) return SCRIPT;
        if (value.equals("Stylesheet")) return STYLESHEET;
        if (value.equals("XHR")) return XHR;
        throw new IOException("Cannot deserialize ResourceType");
    }
}
