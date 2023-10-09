package org.morken.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ws.rs.Produces;
import java.util.Set;

@Produces("application/json")
public class Customer {

    @JsonProperty
    private long id;

    @JsonProperty
    private Set<InsuranceDeal> insurances;

    @JsonCreator
    public Customer() {
        // Jackson Creator
    }

    public Customer(long id, Set<InsuranceDeal> insurances) {
        this.id = id;
        this.insurances = insurances;
    }

    public long getId() {
        return id;
    }

    public Set<InsuranceDeal> getInsurances() {
        return insurances;
    }
}
