package org.morken.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ws.rs.Consumes;

@Consumes("application/json")
public class InsuranceDealInput {

  @JsonProperty("type")
  public InsuranceType type;

  @JsonCreator
  public InsuranceDealInput() {
    // Jackson creator
  }

  public InsuranceDealInput(InsuranceType type) {
    this.type = type;
  }

  public InsuranceType getType() {
    return type;
  }
}
