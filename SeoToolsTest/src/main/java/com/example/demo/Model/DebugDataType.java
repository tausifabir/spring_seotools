package com.example.demo.Model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DebugDataType {
    DEBUGDATA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DEBUGDATA: return "debugdata";
        }
        return null;
    }

    @JsonCreator
    public static DebugDataType forValue(String value) throws IOException {
        if (value.equals("debugdata")) return DEBUGDATA;
        throw new IOException("Cannot deserialize DebugDataType");
    }
}
