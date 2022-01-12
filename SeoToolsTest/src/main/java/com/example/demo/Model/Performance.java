package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class Performance {
    private String id;
    private String title;
    private Double score;
    private AuditRef[] auditRefs;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("score")
    public Double getScore() { return score; }
    @JsonProperty("score")
    public void setScore(Double value) { this.score = value; }

    @JsonProperty("auditRefs")
    public AuditRef[] getAuditRefs() { return auditRefs; }
    @JsonProperty("auditRefs")
    public void setAuditRefs(AuditRef[] value) { this.auditRefs = value; }
}
