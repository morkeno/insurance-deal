package org.morken.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuranceDealInput {

  @JsonProperty public Customer customer;

  @JsonProperty public InsuranceDeal insurance;

  @JsonCreator
  public InsuranceDealInput() {
    // Jackson creator
  }

  public Customer getCustomer() {
    return customer;
  }

  public InsuranceDeal getInsurance() {
    return insurance;
  }
}
