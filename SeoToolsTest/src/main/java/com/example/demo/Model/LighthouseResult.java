package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class LighthouseResult {
    private String requestedURL;
    private String finalURL;
    private String lighthouseVersion;
    private String userAgent;
    private OffsetDateTime fetchTime;
    private Environment environment;
    private Object[] runWarnings;
    private ConfigSettings configSettings;
    private Audits audits;
    private Categories categories;
    private CategoryGroups categoryGroups;
    private Timing timing;
    private I18N i18N;

    @JsonProperty("requestedUrl")
    public String getRequestedURL() { return requestedURL; }
    @JsonProperty("requestedUrl")
    public void setRequestedURL(String value) { this.requestedURL = value; }

    @JsonProperty("finalUrl")
    public String getFinalURL() { return finalURL; }
    @JsonProperty("finalUrl")
    public void setFinalURL(String value) { this.finalURL = value; }

    @JsonProperty("lighthouseVersion")
    public String getLighthouseVersion() { return lighthouseVersion; }
    @JsonProperty("lighthouseVersion")
    public void setLighthouseVersion(String value) { this.lighthouseVersion = value; }

    @JsonProperty("userAgent")
    public String getUserAgent() { return userAgent; }
    @JsonProperty("userAgent")
    public void setUserAgent(String value) { this.userAgent = value; }

    @JsonProperty("fetchTime")
    public OffsetDateTime getFetchTime() { return fetchTime; }
    @JsonProperty("fetchTime")
    public void setFetchTime(OffsetDateTime value) { this.fetchTime = value; }

    @JsonProperty("environment")
    public Environment getEnvironment() { return environment; }
    @JsonProperty("environment")
    public void setEnvironment(Environment value) { this.environment = value; }

    @JsonProperty("runWarnings")
    public Object[] getRunWarnings() { return runWarnings; }
    @JsonProperty("runWarnings")
    public void setRunWarnings(Object[] value) { this.runWarnings = value; }

    @JsonProperty("configSettings")
    public ConfigSettings getConfigSettings() { return configSettings; }
    @JsonProperty("configSettings")
    public void setConfigSettings(ConfigSettings value) { this.configSettings = value; }

    @JsonProperty("audits")
    public Audits getAudits() { return audits; }
    @JsonProperty("audits")
    public void setAudits(Audits value) { this.audits = value; }

    @JsonProperty("categories")
    public Categories getCategories() { return categories; }
    @JsonProperty("categories")
    public void setCategories(Categories value) { this.categories = value; }

    @JsonProperty("categoryGroups")
    public CategoryGroups getCategoryGroups() { return categoryGroups; }
    @JsonProperty("categoryGroups")
    public void setCategoryGroups(CategoryGroups value) { this.categoryGroups = value; }

    @JsonProperty("timing")
    public Timing getTiming() { return timing; }
    @JsonProperty("timing")
    public void setTiming(Timing value) { this.timing = value; }

    @JsonProperty("i18n")
    public I18N getI18N() { return i18N; }
    @JsonProperty("i18n")
    public void setI18N(I18N value) { this.i18N = value; }
}
