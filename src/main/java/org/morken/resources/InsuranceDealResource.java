package org.morken.resources;

import org.glassfish.grizzly.utils.Pair;
import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;
import org.morken.api.InsuranceDealInput;
import org.morken.subjectsystem.System;
import org.morken.subjectsystem.SystemDAO;
import org.morken.subjectsystem.SystemResource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Objects;

@Path("/insurance")
@Produces("application/json")
public class InsuranceDealResource extends Resource {

  public InsuranceDealResource() {}

  @POST
  @Consumes("application/json")
  public Pair<Long, Long> createInsuranceDeal(InsuranceDealInput input) {
    long customerId = systemResource.createCustomer();
    long insuranceId =
        systemResource.createInsurance(customerId, Objects.requireNonNull(input.getType()));
    return new Pair<Long, Long>(customerId, insuranceId);
  }
}
