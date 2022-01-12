package com.example.demo.Model;

import com.fasterxml.jackson.annotation.*;

public class AuditRef {
    private String id;
    private Long weight;
    private Group group;
    private String acronym;
    private String[] relevantAudits;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("weight")
    public Long getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(Long value) { this.weight = value; }

    @JsonProperty("group")
    public Group getGroup() { return group; }
    @JsonProperty("group")
    public void setGroup(Group value) { this.group = value; }

    @JsonProperty("acronym")
    public String getAcronym() { return acronym; }
    @JsonProperty("acronym")
    public void setAcronym(String value) { this.acronym = value; }

    @JsonProperty("relevantAudits")
    public String[] getRelevantAudits() { return relevantAudits; }
    @JsonProperty("relevantAudits")
    public void setRelevantAudits(String[] value) { this.relevantAudits = value; }
}
