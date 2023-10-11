package org.morken.resources;

import org.glassfish.grizzly.utils.Pair;
import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;
import org.morken.api.InsuranceDealInput;
import org.morken.subjectsystem.System;
import org.morken.subjectsystem.SystemDAO;
import org.morken.subjectsystem.SystemResource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/insurance")
public class InsuranceDealResource extends Resource {

  public InsuranceDealResource() {
  }

  @POST
  public Pair<Long, Long> createInsuranceDeal(InsuranceDealInput input) {
    // TODO
    // doCallSubjectSystem()
    // return "Success or failure. deal number and status as object if created";
    long customerId = systemResource.createCustomer();
    long insuranceId = systemResource.createInsurance(customerId, input.getInsurance());
    return new Pair<Long, Long>(customerId, insuranceId);
  }
}
