package com.example.demo.Model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SubItemsType {
    SUBITEMS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case SUBITEMS: return "subitems";
        }
        return null;
    }

    @JsonCreator
    public static SubItemsType forValue(String value) throws IOException {
        if (value.equals("subitems")) return SUBITEMS;
        throw new IOException("Cannot deserialize SubItemsType");
    }
}
