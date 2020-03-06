package com.mobile.looke.data.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "batter"
})
public class Batters {

    @JsonProperty("batter")
    private List<Batter> batter = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public Batters() {
    }

    public Batters(List<Batter> batter) {
        super();
        this.batter = batter;
    }

    @JsonProperty("batter")
    public List<Batter> getBatter() {
        return batter;
    }

    @JsonProperty("batter")
    public void setBatter(List<Batter> batter) {
        this.batter = batter;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
