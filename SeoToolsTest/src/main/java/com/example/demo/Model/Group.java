package com.example.demo.Model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Group {
    BUDGETS, HIDDEN, METRICS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BUDGETS: return "budgets";
            case HIDDEN: return "hidden";
            case METRICS: return "metrics";
        }
        return null;
    }

    @JsonCreator
    public static Group forValue(String value) throws IOException {
        if (value.equals("budgets")) return BUDGETS;
        if (value.equals("hidden")) return HIDDEN;
        if (value.equals("metrics")) return METRICS;
        throw new IOException("Cannot deserialize Group");
    }
}
