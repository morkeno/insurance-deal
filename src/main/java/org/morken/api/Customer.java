package org.morken.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.ws.rs.Produces;

@Produces("application/json")
public class Customer {

    @JsonProperty private long id;

    @JsonProperty private HashSet<InsuranceDeal> insurances;

    @JsonCreator
    public Customer() {
        // Jackson Creator
    }

    public Customer(long id, Set<InsuranceDeal> insurances) {
        this.id = id;
        this.insurances = new HashSet<>(insurances);
    }

    public long getId() {
        return id;
    }

    public Set<InsuranceDeal> getInsurances() {
        return insurances;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Customer that) {
            return Objects.equals(this.id, that.getId())
                    && Objects.equals(this.insurances, that.getInsurances());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, insurances);
    }
}
