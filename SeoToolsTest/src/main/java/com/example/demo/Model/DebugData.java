package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class DebugData {
    private Long maxAge;
    private Boolean debugDataPublic;
    private DebugDataType type;
    private String staleIfError;
    private String sMaxage;
    private String staleWhileRevalidate;

    @JsonProperty("max-age")
    public Long getMaxAge() { return maxAge; }
    @JsonProperty("max-age")
    public void setMaxAge(Long value) { this.maxAge = value; }

    @JsonProperty("public")
    public Boolean getDebugDataPublic() { return debugDataPublic; }
    @JsonProperty("public")
    public void setDebugDataPublic(Boolean value) { this.debugDataPublic = value; }

    @JsonProperty("type")
    public DebugDataType getType() { return type; }
    @JsonProperty("type")
    public void setType(DebugDataType value) { this.type = value; }

    @JsonProperty("stale-if-error")
    public String getStaleIfError() { return staleIfError; }
    @JsonProperty("stale-if-error")
    public void setStaleIfError(String value) { this.staleIfError = value; }

    @JsonProperty("s-maxage")
    public String getSMaxage() { return sMaxage; }
    @JsonProperty("s-maxage")
    public void setSMaxage(String value) { this.sMaxage = value; }

    @JsonProperty("stale-while-revalidate")
    public String getStaleWhileRevalidate() { return staleWhileRevalidate; }
    @JsonProperty("stale-while-revalidate")
    public void setStaleWhileRevalidate(String value) { this.staleWhileRevalidate = value; }
}
