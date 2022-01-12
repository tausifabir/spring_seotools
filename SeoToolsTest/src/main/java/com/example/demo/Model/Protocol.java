package com.example.demo.Model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Protocol {
    DATA, H2, HTTP_11;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DATA: return "data";
            case H2: return "h2";
            case HTTP_11: return "http/1.1";
        }
        return null;
    }

    @JsonCreator
    public static Protocol forValue(String value) throws IOException {
        if (value.equals("data")) return DATA;
        if (value.equals("h2")) return H2;
        if (value.equals("http/1.1")) return HTTP_11;
        throw new IOException("Cannot deserialize Protocol");
    }
}
