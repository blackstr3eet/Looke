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
        "id",
        "type",
        "name",
        "ppu",
        "batters",
        "topping"
})
public class ResponseBody {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ppu")
    private double ppu;
    @JsonProperty("batters")
    private Batters batters;
    @JsonProperty("topping")
    private List<Topping> topping = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public ResponseBody() {
    }

    public ResponseBody(String id, String type, String name, double ppu, Batters batters, List<Topping> topping) {
        super();
        this.id = id;
        this.type = type;
        this.name = name;
        this.ppu = ppu;
        this.batters = batters;
        this.topping = topping;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ppu")
    public double getPpu() {
        return ppu;
    }

    @JsonProperty("ppu")
    public void setPpu(double ppu) {
        this.ppu = ppu;
    }

    @JsonProperty("batters")
    public Batters getBatters() {
        return batters;
    }

    @JsonProperty("batters")
    public void setBatters(Batters batters) {
        this.batters = batters;
    }

    @JsonProperty("topping")
    public List<Topping> getTopping() {
        return topping;
    }

    @JsonProperty("topping")
    public void setTopping(List<Topping> topping) {
        this.topping = topping;
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