package com.example.demo.Model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ValueTypeEnum {
    SOURCE_LOCATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SOURCE_LOCATION: return "source-location";
        }
        return null;
    }

    @JsonCreator
    public static ValueTypeEnum forValue(String value) throws IOException {
        if (value.equals("source-location")) return SOURCE_LOCATION;
        throw new IOException("Cannot deserialize ValueTypeEnum");
    }
}
