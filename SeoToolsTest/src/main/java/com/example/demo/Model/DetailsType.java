package com.example.demo.Model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DetailsType {
    OPPORTUNITY, TABLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OPPORTUNITY: return "opportunity";
            case TABLE: return "table";
        }
        return null;
    }

    @JsonCreator
    public static DetailsType forValue(String value) throws IOException {
        if (value.equals("opportunity")) return OPPORTUNITY;
        if (value.equals("table")) return TABLE;
        throw new IOException("Cannot deserialize DetailsType");
    }
}
