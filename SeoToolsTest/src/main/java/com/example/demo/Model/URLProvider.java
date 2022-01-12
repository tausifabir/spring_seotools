package com.example.demo.Model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum URLProvider {
    NETWORK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NETWORK: return "network";
        }
        return null;
    }

    @JsonCreator
    public static URLProvider forValue(String value) throws IOException {
        if (value.equals("network")) return NETWORK;
        throw new IOException("Cannot deserialize URLProvider");
    }
}
