package org.morken.resources;

import org.morken.api.Customer;
import org.morken.api.InsuranceDeal;
import org.morken.api.InsuranceDealInput;
import org.morken.subjectsystem.SystemResource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/insurance")
public class InsuranceDealResource {

  private SystemResource systemResource;

  private InsuranceDealResource() {
    // Empty constructor
  }

  public InsuranceDealResource(SystemResource systemResource) {
    this.systemResource = systemResource;
  }

  @POST
  @Path("/insurance")
  public Response createInsuranceDeal(InsuranceDealInput input) {
    // TODO
    // doCallSubjectSystem()
    // return "Success or failure. deal number and status as object if created";
    Customer customer = systemResource.createCustomer().readEntity(Customer.class);
    systemResource.createInsurance(customer.getId(), input.getInsurance());
    return Response.ok(customer).build();
  }
}
