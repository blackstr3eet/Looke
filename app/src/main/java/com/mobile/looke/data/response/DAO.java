package com.mobile.looke.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mobile.looke.data.domain.Topping;
import java.util.List;

public class DAO {

    @JsonProperty("topping")
    public List<Topping> topping;
}