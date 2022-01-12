package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class Welcome {
    private String captchaResult;
    private String kind;
    private String id;
    private LoadingExperience loadingExperience;
    private LoadingExperience originLoadingExperience;
    private LighthouseResult lighthouseResult;
    private OffsetDateTime analysisUTCTimestamp;

    @JsonProperty("captchaResult")
    public String getCAPTCHAResult() { return captchaResult; }
    @JsonProperty("captchaResult")
    public void setCAPTCHAResult(String value) { this.captchaResult = value; }

    @JsonProperty("kind")
    public String getKind() { return kind; }
    @JsonProperty("kind")
    public void setKind(String value) { this.kind = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("loadingExperience")
    public LoadingExperience getLoadingExperience() { return loadingExperience; }
    @JsonProperty("loadingExperience")
    public void setLoadingExperience(LoadingExperience value) { this.loadingExperience = value; }

    @JsonProperty("originLoadingExperience")
    public LoadingExperience getOriginLoadingExperience() { return originLoadingExperience; }
    @JsonProperty("originLoadingExperience")
    public void setOriginLoadingExperience(LoadingExperience value) { this.originLoadingExperience = value; }

    @JsonProperty("lighthouseResult")
    public LighthouseResult getLighthouseResult() { return lighthouseResult; }
    @JsonProperty("lighthouseResult")
    public void setLighthouseResult(LighthouseResult value) { this.lighthouseResult = value; }

    @JsonProperty("analysisUTCTimestamp")
    public OffsetDateTime getAnalysisUTCTimestamp() { return analysisUTCTimestamp; }
    @JsonProperty("analysisUTCTimestamp")
    public void setAnalysisUTCTimestamp(OffsetDateTime value) { this.analysisUTCTimestamp = value; }
}
