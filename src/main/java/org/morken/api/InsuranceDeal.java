package org.morken.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ws.rs.Produces;
import java.util.Objects;

@Produces("application/json")
public class InsuranceDeal {

  @JsonProperty private long id;

  @JsonProperty private boolean active;

  @JsonProperty private InsuranceType type;

  @JsonCreator
  public InsuranceDeal() {
    // Jackson creator
  }

  public InsuranceDeal(long id, boolean active, InsuranceType type) {
    this.id = id;
    this.active = active;
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public boolean isActive() {
    return active;
  }

  public InsuranceType getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof InsuranceDeal that) {
      return Objects.equals(this.id, that.getId())
          && Objects.equals(this.active, that.isActive())
          && Objects.equals(this.type, that.type);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, type);
  }
}
